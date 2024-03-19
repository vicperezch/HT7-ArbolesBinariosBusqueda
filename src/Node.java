package src;

/**
 * @author Victor Pérez
 * @date 19/03/2024
 * Clase que representa un nodo del árbol binario
 */
public class Node<E> {
    private E value;
    private Node<E> left;
    private Node<E> right;

    /**
     * Constructor de la clase
     * @param value Valor del nodo
     */
    public Node(E value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    /**
     * Método que devuelve el valor del nodo
     * @return Valor del nodo
     */
    public E getValue() {
        return this.value;
    }

    /**
     * Método que devuelve el nodo izquierdo
     * @return Nodo izquierdo
     */
    public Node<E> getLeft() {
        return this.left;
    }

    /**
     * Método que devuelve el nodo derecho
     * @return Nodo derecho
     */
    public Node<E> getRight() {
        return this.right;
    }

    /**
     * Cambia el valor del nodo
     * @param value Nuevo valor
     */
    public void setValue(E value) {
        this.value = value;
    }

    /**
     * Cambia el nodo izquierdo
     * @param left Nuevo nodo izquierdo
     */
    public void setLeft(Node<E> left) {
        this.left = left;
    }

    /**
     * Cambia el nodo derecho
     * @param right Nuevo nodo derecho
     */
    public void setRight(Node<E> right) {
        this.right = right;
    }
}
