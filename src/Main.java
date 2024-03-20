package src;

/**
 * @author Victor Pérez
 * @date 19/03/2024
 * Clase principal que ejecuta el programa
 */
public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("diccionario.txt");
        try {
            BinaryTree<String, String> words = reader.readDictionary();
            System.out.println(words.inOrder());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
