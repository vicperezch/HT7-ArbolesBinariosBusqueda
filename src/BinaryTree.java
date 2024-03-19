package src;

/**
 * @author Victor Pérez
 * @date 19/03/2024
 * Clase que modela un árbol binario de búsqueda
 */
public class BinaryTree<E extends Comparable<E>> {
    private Node<E> root;

    /**
     * Constructor de la clase
     */
    public BinaryTree() {
        this.root = null;
    }


    /**
     * Inserta un nuevo valor en el árbol
     * @param value Valor a insertar
     */
    public void insert(E value) {
        if (this.root == null) {
            this.root = new Node<E>(value);

        } else {
            insert(value, this.root);
        }
    }


    /**
     * Recorre el árbol para insertar un elemento nuevo de manera recursiva
     * @param value Valor a insertar
     * @param current Posición actual en los nodos
     */
    private void insert(E value, Node<E> current) {
        if (value.compareTo(current.getValue()) == 0) {
            throw new IllegalArgumentException("El valor ya existe en el árbol");
        }

        if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null) {
                current.setLeft(new Node<E>(value));

            } else {
                insert(value, current.getLeft()); 
            }

        } else {
            if (current.getRight() == null) {
                current.setRight(new Node<E>(value));

            } else {
                insert(value, current.getRight());
            }
        }
    }


    /**
     * Busca un valor en el árbol
     * @param value Valor a buscar
     * @return true si el valor está en el árbol, false en caso contrario
     */
    public boolean search(E value) {
        if (this.root == null) {
            throw new IllegalArgumentException("El árbol está vacío");
        }

        if (value.compareTo(this.root.getValue()) == 0) {
            return true;

        } else {
            return search(value, this.root);
        }
    }


    /**
     * Recorre el árbol de manera recursiva para buscar un valor
     * @param value Valor a buscar
     * @param current Posición actual en los nodos
     * @return true si el valor es igual al del nodo, false en caso contrario
     */
    private boolean search(E value, Node<E> current) {
        if (value.compareTo(current.getValue()) == 0) {
            return true;

        } else if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null) {
                return false;

            } else {
                return search(value, current.getLeft());
            }

        } else {
            if (current.getRight() == null) {
                return false;

            } else {
                return search(value, current.getRight());
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
    private String inOrder(Node<E> current) {
        String content = "";

        if (current.getLeft() != null) {
            content += inOrder(current.getLeft());
        }

        content += current.getValue() + "\n";

        if (current.getRight() != null) {
            content += inOrder(current.getRight());
        }

        return content;
    }
}
