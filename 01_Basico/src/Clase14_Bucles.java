import java.util.Scanner;

/**
 * Clase14_Bucles.java
 *
 * Esta clase implementa un juego en el que el usuario debe adivinar un número aleatorio
 * entre 0 y 100. El usuario tiene la oportunidad de intentar adivinar el número, y
 * el programa le indicará si el número ingresado es muy alto, muy bajo o correcto.
 * El juego se ejecuta primero con un bucle `while` y luego con un bucle `do-while`.
 * 
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase14_Bucles {

    /**
     * Método principal que ejecuta el juego de adivinanza de números.
     * Solicita al usuario que introduzca un número y proporciona
     * retroalimentación sobre si el número es demasiado alto o bajo.
     * Se repite utilizando tanto un bucle `while` como un bucle `do-while`.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Genera un número aleatorio entre 0 y 99
        int aleatorio = (int) (Math.random() * 100);
        int numero = -1;
        int intentos = 0;
        
        // Bucle while para adivinar el número aleatorio
        while (numero != aleatorio) {
            System.out.println("Introduce un número, por favor");
            
            // Verificar que el usuario introduzca un número válido
            if (entrada.hasNextInt()) {
                numero = entrada.nextInt();
                // Verificar que el número esté en el rango de 0 a 100
                if (numero < 0 || numero > 100) {
                    System.out.println("Por favor, introduce un número entre 0 y 100.");
                    continue;  // Si no está en el rango, vuelve al inicio del ciclo
                }
            } else {
                System.out.println("Por favor, introduce un número válido.");
                entrada.next();  // Limpiar la entrada no válida
                continue;  // Volver al inicio del ciclo
            }
            
            // Comparar el número ingresado con el aleatorio
            if (aleatorio < numero) {
                System.out.println("El número ingresado es muy alto");
            } else if (aleatorio > numero) {
                System.out.println("El número ingresado es muy bajo");
            }
            
            intentos++;
        }
        
        System.out.println("¡Correcto! Lo has conseguido en " + intentos + " intentos.");
        
        // Genera un nuevo número aleatorio para la segunda parte del juego
        aleatorio = (int) (Math.random() * 100);  // Genera un número aleatorio entre 0 y 99
        numero = -1;
        intentos = 0;
        
        // Bucle do-while para adivinar el número aleatorio
        do {
            System.out.println("Introduce un número, por favor");
            
            // Verificar que el usuario introduzca un número válido
            if (entrada.hasNextInt()) {
                numero = entrada.nextInt();
                // Verificar que el número esté en el rango de 0 a 100
                if (numero < 0 || numero > 100) {
                    System.out.println("Por favor, introduce un número entre 0 y 100.");
                    continue;  // Si no está en el rango, vuelve al inicio del ciclo
                }
            } else {
                System.out.println("Por favor, introduce un número válido.");
                entrada.next();  // Limpiar la entrada no válida
                continue;  // Volver al inicio del ciclo
            }
            
            // Comparar el número ingresado con el aleatorio
            if (aleatorio < numero) {
                System.out.println("El número ingresado es muy alto");
            } else if (aleatorio > numero) {
                System.out.println("El número ingresado es muy bajo");
            }
            
            intentos++;
        } while (numero != aleatorio);
        
        System.out.println("¡Correcto! Lo has conseguido en " + intentos + " intentos.");
        
        entrada.close();  // Cerrar el Scanner para liberar recursos
    }
}
