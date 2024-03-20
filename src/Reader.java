package src;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Victor Pérez
 * @date 19/03/2024
 * Clase que lee los archivos proveídos por el usuario
 */
public class Reader {
    private File dictionary;
    private File textFile;

    /**
     * Constructor de la clase
     * @param dictionary Nombre del archivo que contiene el diccionario
     */
    public Reader(String dictionary, String textFile) {
        this.dictionary = new File(dictionary);
        this.textFile = new File(textFile);
    }


    /**
     * Lee el diccionario y devuelve un árbol binario de búsqueda con las palabras
     * @return Árbol binario de búsqueda con las palabras
     */
    public BinaryTree<String, String> readDictionary() {
        BinaryTree<String, String> words = new BinaryTree<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(dictionary));

            String line = br.readLine();
            while (line != null) {
                String replacedWords = line.replaceAll("[\\(\\)]", "");
                String[] pair = replacedWords.split(",");
                words.insert(pair[0], pair[1].substring(1));
                line = br.readLine();
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        return words;
    }


    /**
     * Lee el texto para traducir
     * @return ArrayList de enunciados a traducir
     */
    public ArrayList<String> readText() {
        ArrayList<String> text = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(textFile));

            String line = br.readLine();
            while (line != null) {
                text.add(line);
                line = br.readLine();
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");

        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return text;
    }
}
