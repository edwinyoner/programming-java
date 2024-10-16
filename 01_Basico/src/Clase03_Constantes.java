/**
 * Clase03_Constantes.java
 * 
 * Esta clase demuestra el uso de constantes en Java, realizando operaciones 
 * como división, conversión de unidades (centímetros a pulgadas) y suma de enteros.
 *
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase03_Constantes {

    /**
     * Método principal que realiza las siguientes operaciones:
     * 1. División de dos números de tipo double.
     * 2. Conversión de centímetros a pulgadas utilizando una constante.
     * 3. Suma de dos números enteros.
     * 
     * @param args Los argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        
        // División de dos números
        double divisor = 5;
        double dividendo = 10;
        double cociente = dividendo / divisor;
        System.out.println("El resultado de la división es: " + cociente);
        
        // Conversión de centímetros a pulgadas
        final double CENTIMETROS_A_PULGADAS = 2.54;  // Constante de conversión
        double centimetros = 6;
        double pulgadas = centimetros / CENTIMETROS_A_PULGADAS;
        // Mostrar el resultado con dos cifras decimales
        System.out.printf("En %.2f cm hay %.2f pulgadas%n", centimetros, pulgadas);
        
        // Suma de dos números enteros
        int operador1 = 8;
        int operador2 = 7;
        int resultadoSuma = operador1 + operador2;
        System.out.println("La suma de " + operador1 + " y " + operador2 + " es: " + resultadoSuma);
    }

}
