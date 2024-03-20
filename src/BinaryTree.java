package src;

/**
 * @author Victor Pérez
 * @date 19/03/2024
 * Clase que modela un árbol binario de búsqueda formado por asociaciones
 */
public class BinaryTree<K extends Comparable<K>, V extends Comparable <V>> {
    private Association<K, V> root;

    /**
     * Constructor de la clase
     */
    public BinaryTree() {
        this.root = null;
    }


    /**
     * Inserta una nueva asociación en el árbol
     * @param key Llave a insertar
     * @param value Valor a insertar
     */
    public void insert(K key, V value) {
        if (this.root == null) {
            this.root = new Association<K, V>(key, value);

        } else {
            insert(key, value, this.root);
        }
    }


    /**
     * Recorre el árbol para insertar un elemento nuevo de manera recursiva
     * @param key Llave a insertar
     * @param value Valor a insertar
     * @param current Posición actual en los nodos
     */
    private void insert(K key, V value, Association<K, V> current) {
        if (key.compareTo(current.getKey()) == 0) {
            throw new IllegalArgumentException("El valor ya existe en el árbol");
        }

        if (key.compareTo(current.getKey()) < 0) {
            if (current.getLeft() == null) {
                current.setLeft(new Association<K, V>(key, value));

            } else {
                insert(key, value, current.getLeft()); 
            }

        } else {
            if (current.getRight() == null) {
                current.setRight(new Association<K, V>(key, value));

            } else {
                insert(key, value, current.getRight());
            }
        }
    }


    /**
     * Busca un valor en el árbol
     * @param key Valor a buscar
     * @return true si el valor está en el árbol, false en caso contrario
     */
    public boolean search(K key) {
        if (this.root == null) {
            throw new IllegalArgumentException("El árbol está vacío");
        }

        if (key.compareTo(this.root.getKey()) == 0) {
            return true;

        } else {
            return search(key, this.root);
        }
    }


    /**
     * Recorre el árbol de manera recursiva para buscar un valor
     * @param key Valor a buscar
     * @param current Posición actual en los nodos
     * @return true si el valor es igual al del nodo, false en caso contrario
     */
    private boolean search(K key, Association<K, V> current) {
        if (key.compareTo(current.getKey()) == 0) {
            return true;

        } else if (key.compareTo(current.getKey()) < 0) {
            if (current.getLeft() == null) {
                return false;

            } else {
                return search(key, current.getLeft());
            }

        } else {
            if (current.getRight() == null) {
                return false;

            } else {
                return search(key, current.getRight());
            }
        }
    }


    /**
     * Recorre el árbol in order
     * @return Contenido del árbol en orden
     */
    public String inOrder() {
        String content = "";

        if (this.root == null) {
            throw new IllegalArgumentException("El árbol está vacío");
        }

        content += inOrder(this.root);

        return content;
    }


    /**
     * Recorre el árbol de manera recursiva in order
     * @param current Posición actual en los nodos
     * @return Contenido del árbol en orden
     */
    private String inOrder(Association<K, V> current) {
        String content = "";

        if (current.getLeft() != null) {
            content += inOrder(current.getLeft());
        }

        content += current.getKey() + " - " + current.getValue() + "\n";

        if (current.getRight() != null) {
            content += inOrder(current.getRight());
        }

        return content;
    }
}
