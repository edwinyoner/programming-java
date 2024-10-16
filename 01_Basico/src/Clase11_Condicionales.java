import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase11_Condicionales.java
 *
 * Esta clase solicita la edad del usuario y la clasifica en diferentes rangos etarios,
 * manejando excepciones y validaciones adecuadas.
 * 
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase11_Condicionales {

    /**
     * Método principal que ejecuta el programa.
     * Solicita al usuario que ingrese su edad y la clasifica en rangos etarios
     * apropiados. El programa continúa pidiendo la edad hasta que se introduce un
     * valor válido entre 0 y 100. Maneja excepciones para entradas no válidas
     * y proporciona mensajes de retroalimentación al usuario.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        
        // try-with-resources garantiza que el Scanner se cierra automáticamente
        try (Scanner entrada = new Scanner(System.in)) {
            int edad = -1; // Inicializar la edad en -1 para asegurar que entre en el bucle
            
            while (edad < 0 || edad > 100) { // Ciclo que se repite hasta que se introduce una edad válida
                try {
                    // Solicitar la edad al usuario
                    System.out.println("Introduce tu edad en años (debe estar entre 0 y 100):");
                    edad = entrada.nextInt();
                    
                    // Validar que la edad esté dentro del rango permitido
                    if (edad < 0 || edad > 100) {
                        System.out.println("La edad debe estar entre 0 y 100. Intenta de nuevo.");
                    } else {
                        // Clasificación según la edad
                        if (edad >= 0 && edad <= 12) {
                            System.out.println("Eres un niño.");
                        } else if (edad >= 13 && edad <= 17) {
                            System.out.println("Eres un adolescente.");
                        } else if (edad >= 18 && edad <= 39) {
                            System.out.println("Eres joven.");
                        } else if (edad >= 40 && edad <= 64) {
                            System.out.println("Eres maduro.");
                        } else {
                            System.out.println("Eres anciano.");
                        }
                    }
                    
                } catch (InputMismatchException e) {
                    // Manejo de excepción si la entrada no es un número válido
                    System.out.println("Por favor, introduce un número válido.");
                    entrada.next(); // Limpiar la entrada incorrecta
                }
            }
        }
    }
}
