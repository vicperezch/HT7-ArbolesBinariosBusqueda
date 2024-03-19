package src;

/**
 * @author Victor Pérez
 * @date 19/03/2024
 * Clase que representa una asociación del diccionario
 */
public class Association<K,V> implements Comparable<Association<K,V>> {
    private K key;
    private V value;


    /**
     * Constructor de la clase
     * @param key Palabra en español que funciona como llave
     * @param value Palabra en inglés que funciona como valor
     */
    public Association(K key, V value) {
        this.key = key;
        this.value = value;
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


    @Override
    public int compareTo(Association<K, V> o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
