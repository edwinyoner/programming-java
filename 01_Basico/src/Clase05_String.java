/**
 * Clase05_String.java
 * 
 * Esta clase demuestra el uso de la clase String en Java, mostrando diversas 
 * operaciones que se pueden realizar con cadenas de texto, como obtener su 
 * longitud, caracteres específicos y más.
 *
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase05_String {

    /**
     * Método principal que ejecuta varias operaciones con cadenas de texto:
     * 1. Imprimir el nombre.
     * 2. Mostrar la longitud del nombre.
     * 3. Mostrar la primera letra del nombre.
     * 4. Mostrar la última letra del nombre.
     * 
     * @param args Los argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        
        // Nombre a trabajar
        String nombre = "Edwin";
        
        // Imprimir el nombre
        System.out.println("Mi nombre es: " + nombre);
        
        // Mostrar la longitud del nombre
        System.out.println("Mi nombre tiene: " + nombre.length() + " letras");
        
        // Mostrar la primera letra del nombre
        System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
        
        // Calcular la posición de la última letra
        final int ultimaLetraPos = nombre.length() - 1;
        
        // Mostrar la última letra del nombre
        System.out.println("Y la última letra es la: " + nombre.charAt(ultimaLetraPos));
    }

}
