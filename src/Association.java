package src;

/**
 * @author Victor Pérez
 * @date 19/03/2024
 * Clase que representa una asociación del diccionario
 */
public class Association<K, V>  {
    private K key;
    private V value;
    private Association<K, V> left;
    private Association<K, V> right;


    /**
     * Constructor de la clase
     * @param key Palabra en español que funciona como llave
     * @param value Palabra en inglés que funciona como valor
     */
    public Association(K key, V value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }


    /**
     * Método que devuelve la llave
     * @return Llave
     */
    public K getKey() {
        return this.key;
    }


    /**
     * Método que devuelve el valor
     * @return Valor
     */
    public V getValue() {
        return this.value;
    }


    /**
     * Cambia el valor a uno nuevo
     * @param value Nuevo valor
     * @return Valor antiguo
     */
    public void setValue(V value) {
        this.value = value;
    }


    /**
     * Método que devuelve el nodo izquierdo
     * @return Nodo izquierdo
     */
    public Association<K, V> getLeft() {
        return this.left;
    }


    /**
     * Método que devuelve el nodo derecho
     * @return Nodo derecho
     */
    public Association<K, V> getRight() {
        return this.right;
    }


    /**
     * Cambia el nodo izquierdo
     * @param left Nuevo nodo izquierdo
     */
    public void setLeft(Association<K, V> left) {
        this.left = left;
    }

    /**
     * Cambia el nodo derecho
     * @param right Nuevo nodo derecho
     */
    public void setRight(Association<K, V> right) {
        this.right = right;
    }
}
