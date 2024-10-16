import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase08_EntradaSalidaDatos.java
 *
 * Esta clase permite la entrada de datos del usuario, como su nombre y edad,
 * asegurando que el nombre solo contenga letras y espacios y que la edad 
 * sea un número entero válido entre 0 y 100. Se utilizan excepciones para
 * manejar entradas incorrectas de manera segura.
 *
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase08_EntradaSalidaDatos {

    /**
     * Método principal que ejecuta la entrada de datos y la validación.
     *
     * @param args Los argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        
        // try-with-resources garantiza que el Scanner se cierra automáticamente
        try (Scanner entrada = new Scanner(System.in)) {
            String nombreUsuario = "";
            boolean nombreValido = false;
            
            // Ciclo para validar que el nombre no contenga números
            while (!nombreValido) {
                System.out.println("¡Bienvenido! Ingrese su nombre, por favor (solo letras y espacios):");
                nombreUsuario = entrada.nextLine();
                
                // Validar que el nombre no contenga números ni caracteres especiales
                if (nombreUsuario.matches("^[a-zA-Z\\s]+$")) {
                    nombreValido = true;
                } else {
                    System.out.println("Error: El nombre no debe contener números ni caracteres especiales. Inténtalo de nuevo.");
                }
            }
            
            int edad = 0;
            boolean edadValida = false;
            
            // Ciclo para validar que el usuario ingrese un número entero válido entre 0 y 100
            while (!edadValida) {
                System.out.println("Ingrese su edad (debe ser un número entre 0 y 100):");
                
                try {
                    edad = entrada.nextInt();
                    
                    // Validar si la edad está entre 0 y 100
                    if (edad >= 0 && edad <= 100) {
                        edadValida = true;
                    } else {
                        System.out.println("Error: La edad debe estar entre 0 y 100.");
                    }
                    
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un número entero válido.");
                    entrada.next();  // Limpiar la entrada incorrecta
                }
            }
            
            System.out.println("Hola " + nombreUsuario + ". El año que viene tendrás " + (edad + 1) + " años.");
        } // El Scanner se cierra automáticamente aquí
    }
}
