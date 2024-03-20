package src;

/**
 * @author Victor Pérez
 * @date 19/03/2024
 * Traductor de palabras de inglés a español
 */
public class Translator {
    private BinaryTree<String, String> dictionary;

    /**
     * Constructor de la clase
     * @param dictionary Diccionario con las palabras en inglés y su traducción
     */
    public Translator(BinaryTree<String, String> dictionary) {
        this.dictionary = dictionary;
    }


    /**
     * Traduce una oración de inglés a español
     * @param sentence Oración a traducir
     * @return Oración traducida
     */
    public String translate(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder translation = new StringBuilder();

        for (String word : words) {
            boolean isUpperCase = Character.isUpperCase(word.charAt(0));
            word = word.toLowerCase();

            if (word.endsWith(".")) {
                word = word.substring(0, word.length() - 1);
            }

            // Si la palabra está en el diccionario la traduce, si no la marca con asteriscos
            if (dictionary.search(word)) {
                if (isUpperCase) {
                    translation.append(dictionary.get(word).substring(0, 1).toUpperCase() + dictionary.get(word).substring(1) + " ");

                } else {
                    translation.append(dictionary.get(word) + " ");
                }

            } else {
                if (isUpperCase) {
                    translation.append("*" + word.substring(0, 1).toUpperCase() + word.substring(1) + "* ");

                } else {
                    translation.append("*" + word + "* ");
                }
            }
        }

        return translation.toString();
    }
}
