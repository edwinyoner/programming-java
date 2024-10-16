import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;

/**
 * Clase12_Condicionales.java
 *
 * Esta clase permite al usuario calcular el área de diferentes figuras geométricas
 * y manejar excepciones y entradas no válidas adecuadamente.
 * 
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase12_Condicionales {

    /**
     * Método principal que ejecuta el programa.
     * Solicita al usuario que elija una figura geométrica para calcular su área
     * y permite realizar múltiples cálculos hasta que el usuario decida salir.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Solicitar la opción de figura
            System.out.println("Elige una opción: \n1: Cuadrado  \n2: Rectángulo \n3: Triángulo \n4: Círculo \n5: Salir");

            try {
            	int figura = entrada.nextInt();
            	switch (figura) {
                case 1:
                    calcularAreaCuadrado();
                    continuar = false; // Salir del bucle
                    break;
                
                case 2:
                    calcularAreaRectangulo();
                    continuar = false; // Salir del bucle
                    break;
                
                case 3:
                    calcularAreaTriangulo();
                    continuar = false; // Salir del bucle
                    break;
                
                case 4:
                    calcularAreaCirculo();
                    continuar = false; // Salir del bucle
                    break;
                
                case 5:
                    continuar = false; // Salir del bucle
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 5.");
            	}
            } catch (InputMismatchException e) {
            	// Manejo de excepción si la entrada no es un número válido
                System.out.println("Por favor, introduce un número válido.");
                entrada.next(); // Limpiar la entrada incorrecta
            }
        }

        entrada.close(); // Cerrar el escáner
    }

    /**
     * Calcula y muestra el área de un cuadrado.
     * Solicita al usuario el lado del cuadrado y calcula el área usando la fórmula
     * área = lado^2. Maneja la entrada no válida mediante excepciones.
     *
     * @throws NumberFormatException Si la entrada no es un número válido.
     */
    private static void calcularAreaCuadrado() {
        try {
            int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
            System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un número válido para el lado.");
        }
    }

    /**
     * Calcula y muestra el área de un rectángulo.
     * Solicita al usuario la base y la altura del rectángulo y calcula el área
     * usando la fórmula área = base * altura. Maneja la entrada no válida mediante excepciones.
     *
     * @throws NumberFormatException Si la entrada no es un número válido.
     */
    private static void calcularAreaRectangulo() {
        try {
            int baseRect = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectángulo"));
            int alturaRect = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del rectángulo"));
            System.out.println("El área del rectángulo es: " + (baseRect * alturaRect));
        } catch (NumberFormatException e) {
            System.out.println("Ingrese números válidos para la base y la altura.");
        }
    }

    /**
     * Calcula y muestra el área de un triángulo.
     * Solicita al usuario la base y la altura del triángulo y calcula el área
     * usando la fórmula área = (base * altura) / 2. Maneja la entrada no válida mediante excepciones.
     *
     * @throws NumberFormatException Si la entrada no es un número válido.
     */
    private static void calcularAreaTriangulo() {
        try {
            int baseTri = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triángulo"));
            int alturaTri = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triángulo"));
            System.out.println("El área del triángulo es: " + ((baseTri * alturaTri) / 2.0));
        } catch (NumberFormatException e) {
            System.out.println("Ingrese números válidos para la base y la altura.");
        }
    }

    /**
     * Calcula y muestra el área de un círculo.
     * Solicita al usuario el radio del círculo y calcula el área usando la fórmula
     * área = π * radio^2. Maneja la entrada no válida mediante excepciones.
     *
     * @throws NumberFormatException Si la entrada no es un número válido.
     */
    private static void calcularAreaCirculo() {
        try {
            int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del círculo"));
            System.out.printf("El área del círculo es: %1.2f\n", Math.PI * Math.pow(radio, 2));
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un número válido para el radio.");
        }
    }
}
