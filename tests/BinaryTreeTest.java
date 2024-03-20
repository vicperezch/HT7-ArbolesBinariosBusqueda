package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import src.BinaryTree;

/**
 * @author Victor Pérez
 * @date 19/03/2024
 * Clase que prueba el árbol binario de búsqueda
 */
public class BinaryTreeTest {

    /**
     * Test 1: Prueba que insertar elementos en el árbol no genere errores
     */
    @Test
    public void testInsertingElements() {
        BinaryTree<String, String> tree = new BinaryTree<>();
        tree.insert("hello", "hola");
        tree.insert("goodbye", "adiós");
        tree.insert("house", "casa");
        tree.insert("dog", "perro");
        tree.insert("cat", "gato");
        tree.insert("tree", "árbol");
    }


    /**
     * Test 2: Prueba que insertar elementos repetidos genere un error
     */
    @Test
    public void testInsertingRepeatedElements() {
        BinaryTree<String, String> tree = new BinaryTree<>();
        tree.insert("hello", "hola");
        tree.insert("goodbye", "adiós");
        tree.insert("house", "casa");
        tree.insert("dog", "perro");
        tree.insert("cat", "gato");
        tree.insert("tree", "árbol");

        try {
            tree.insert("hello", "hola");
            assert false;

        } catch (IllegalArgumentException e) {
            assert true;
        }
    }


    /**
     * Test 3: Prueba que buscar un elemento en el árbol funcione correctamente
     */
    @Test
    public void testSearchingElement() {
        BinaryTree<String, String> tree = new BinaryTree<>();
        tree.insert("hello", "hola");
        tree.insert("goodbye", "adiós");
        tree.insert("house", "casa");
        tree.insert("dog", "perro");
        tree.insert("cat", "gato");
        tree.insert("tree", "árbol");

        assertTrue(tree.search("hello"));
    }


    /**
     * Test 4: Prueba que buscar un elemento que no está en el árbol funcione correctamente
     */
    @Test
    public void testSearchingNonExistentElement() {
        BinaryTree<String, String> tree = new BinaryTree<>();
        tree.insert("hello", "hola");
        tree.insert("goodbye", "adiós");
        tree.insert("house", "casa");
        tree.insert("dog", "perro");
        tree.insert("cat", "gato");
        tree.insert("tree", "árbol");

        assertTrue(!tree.search("world"));
    }


    /**
     * Test 5: Prueba que buscar un elemento en un árbol vacío funcione correctamente
     */
    @Test
    public void testSearchingElementInEmptyTree() {
        BinaryTree<String, String> tree = new BinaryTree<>();

        try {
            tree.search("hello");
            assert false;

        } catch (IllegalArgumentException e) {
            assert true;
        }
    }
}
