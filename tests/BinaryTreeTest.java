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
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.insert(9);
        tree.insert(1);
    }


    /**
     * Test 2: Prueba que insertar elementos repetidos genere un error
     */
    @Test
    public void testInsertingRepeatedElements() {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.insert(9);
        tree.insert(1);

        try {
            tree.insert(1);
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
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.insert(9);
        tree.insert(1);

        assertTrue(tree.search(5));
    }


    /**
     * Test 4: Prueba que buscar un elemento que no está en el árbol funcione correctamente
     */
    @Test
    public void testSearchingNonExistentElement() {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.insert(9);
        tree.insert(1);

        assertTrue(!tree.search(10));
    }


    /**
     * Test 5: Prueba que buscar un elemento en un árbol vacío funcione correctamente
     */
    @Test
    public void testSearchingElementInEmptyTree() {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();

        try {
            tree.search(5);
            assert false;

        } catch (IllegalArgumentException e) {
            assert true;
        }
    }
}
