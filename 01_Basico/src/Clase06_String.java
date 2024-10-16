/**
 * Clase06_String.java
 *
 * Esta clase muestra el uso de la clase String en Java para manipular cadenas de texto. 
 * En particular, se demuestra cómo concatenar partes de una cadena original para crear 
 * un nuevo mensaje.
 *
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase06_String {

    /**
     * Método principal que ejecuta la manipulación de cadenas de texto.
     * En este caso, se genera una nueva frase a partir de una frase original.
     *
     * @param args Los argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        
        // Frase inicial
        String frase = "Hoy es un estupendo día para aprender a programar en Java";
        
        // Crear una nueva frase concatenando parte de la frase original y un nuevo texto
        String fraseResumen = frase.substring(0, 28) // Toma la primera parte de la frase
                            + " irnos a la playa y olvidarnos de todo..."
                            + " y " + frase.substring(29, 57); // Toma la segunda parte de la frase
        
        // Mostrar el resultado
        System.out.println(fraseResumen);
    }

}
