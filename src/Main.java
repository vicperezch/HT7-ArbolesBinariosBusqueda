package src;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Victor Pérez
 * @date 19/03/2024
 * Clase principal que ejecuta el programa
 */
public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("diccionario.txt", "texto.txt");
        BinaryTree<String, String> words = reader.readDictionary();
        Translator translator = new Translator(words);
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        while (run) {
            System.out.println("\n--- Traductor de inglés a español ---");
            System.out.println("1. Traducir texto");
            System.out.println("2. Ver diccionario ordenado");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1:
                        ArrayList<String> sentences = reader.readText();

                        System.out.println("\nTraducción: ");
                        for (String sentence : sentences) {
                            System.out.println(translator.translate(sentence));
                        }
                        break;

                    case 2:
                        System.out.println("");
                        System.out.println(words.inOrder());
                        break;

                    case 3:
                        run = false;
                        break;

                    default:
                        System.out.println("\nOpción inválida");
                        break;
                }

            } catch (Exception e) {
                sc.nextLine();
                System.out.println("\nOpción inválida");
            }
        }

        sc.close();
    }
}
