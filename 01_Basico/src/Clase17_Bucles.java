import java.math.BigInteger;
import java.util.Scanner;

/**
 * Clase17_Bucles.java
 *
 * Esta clase solicita un número al usuario y calcula su factorial.
 * Se utiliza BigInteger para soportar números grandes.
 *
 * @author Edwin Yoner
 * @version 14/10/2024
 */
public class Clase17_Bucles {

    /**
     * Método principal que solicita un número y calcula su factorial.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        BigInteger factorial = BigInteger.ONE;
        int numero = 0;
        boolean numeroValido = false;

        // Ciclo para validar la entrada del número
        while (!numeroValido) {
            System.out.println("Ingrese un número entero positivo para calcular su factorial:");

            if (entrada.hasNextInt()) {
                numero = entrada.nextInt();

                // Verifica si el número es positivo
                if (numero >= 0) {
                    numeroValido = true;

                    // Cálculo del factorial
                    for (int i = 1; i <= numero; i++) {
                        factorial = factorial.multiply(BigInteger.valueOf(i));
                    }

                } else {
                    System.out.println("Por favor, ingrese un número entero positivo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                entrada.next(); // Limpiar la entrada no válida
            }
        }

        // Mostrar el resultado del factorial
        System.out.println("El factorial de " + numero + " es " + factorial);

        entrada.close();
    }
}
