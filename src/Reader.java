package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Victor Pérez
 * @date 19/03/2024
 * Clase que lee el diccionario proveído por el usuario
 */
public class Reader {
    private File diccionario;

    /**
     * Constructor de la clase
     * @param diccionario Nombre del archivo que contiene el diccionario
     */
    public Reader(String diccionario) {
        this.diccionario = new File(diccionario);
    }


    /**
     * Método que lee el archivo y devuelve un árbol binario de búsqueda con las palabras
     * @return Árbol binario de búsqueda con las palabras
     */
    public BinaryTree<String, String> readDictionary() throws IOException {
        BinaryTree<String, String> words = new BinaryTree<>();
        BufferedReader br = new BufferedReader(new FileReader(diccionario));

        String line = br.readLine();
        while (line != null) {
            String[] pair = line.split(",");
            System.out.println(pair[0] + " " + pair[1]);
            words.insert(pair[0], pair[1]);
            line = br.readLine();
        }

        br.close();

        return words;
    }
}
