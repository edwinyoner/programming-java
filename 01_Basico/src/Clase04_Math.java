/**
 * Clase04_Math.java
 * 
 * Esta clase demuestra el uso de métodos matemáticos de la clase Math en Java, 
 * incluyendo el cálculo de raíces cuadradas, redondeo de números y potencias.
 *
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase04_Math {

    /**
     * Método principal que realiza varias operaciones matemáticas:
     * 1. Calcular la raíz cuadrada de un número.
     * 2. Redondear un número decimal.
     * 3. Calcular la potencia de un número.
     * 
     * @param args Los argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        
        // Calcular la raíz cuadrada de 9
        double raiz = Math.sqrt(9);
        System.out.println("La raíz cuadrada de 9 es: " + raiz);
        
        // Redondear el número 5.81
        double numero = 5.81;
        int numeroRedondeado = (int) Math.round(numero); // Redondeo del número
        System.out.println("El número " + numero + " redondeado es: " + numeroRedondeado);
        
        // Calcular la potencia de base 5 elevado a 3
        double base = 5;
        double exponente = 3;
        double resultadoPotencia = Math.pow(base, exponente); // Cálculo de la potencia
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultadoPotencia);
    }

}
