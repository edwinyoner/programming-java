import javax.swing.*;

/**
 * Clase15_Bucles.java
 *
 * Esta clase calcula el peso ideal de una persona según su género y estatura.
 * Utiliza una interfaz gráfica simple con cuadros de diálogo para solicitar
 * información al usuario y manejar la validación de entradas.
 * 
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase15_Bucles {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Solicita al usuario su género y estatura, valida las entradas,
     * y calcula el peso ideal basado en las especificaciones de 
     * género y estatura.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {

        String genero = "";
        int estatura = 0;
        double pesoIdeal = 0.0;

        // Constantes para el cálculo del peso ideal
        final int DESCUENTO_HOMBRE = 110; // Descuento para calcular peso ideal en hombres
        final int DESCUENTO_MUJER = 120; // Descuento para calcular peso ideal en mujeres
        final int ESTATURA_MINIMA = 25;  // Estatura mínima en cm (recién nacidos)
        final int ESTATURA_MAXIMA = 272;  // Estatura máxima registrada en cm

        // Validar que el género sea 'H' o 'M'
        do {
            genero = JOptionPane.showInputDialog("Ingrese su género (H para hombre, M para mujer)").trim();
            // Mensaje de error si el género no es válido
            if (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M")) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un género válido (H o M).", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));

        // Validar que la estatura esté dentro de los rangos permitidos
        while (true) {
            try {
                // Solicitar la estatura al usuario
                estatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estatura en cm"));
                // Validar que la estatura esté en el rango permitido
                if (estatura < ESTATURA_MINIMA || estatura > ESTATURA_MAXIMA) {
                    JOptionPane.showMessageDialog(null, "La estatura debe estar entre " + ESTATURA_MINIMA + " cm y " + ESTATURA_MAXIMA + " cm.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;  // Volver a pedir la estatura
                }
                break;  // Salir del bucle si la estatura es válida
            } catch (NumberFormatException e) {
                // Mensaje de error si la entrada no es un número válido
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para la estatura.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Calcular el peso ideal según el género
        if (genero.equalsIgnoreCase("H")) {
            pesoIdeal = (estatura - DESCUENTO_HOMBRE); // Cálculo para hombres
        } else {
            pesoIdeal = (estatura - DESCUENTO_MUJER); // Cálculo para mujeres
        }

        // Mostrar el peso ideal
        JOptionPane.showMessageDialog(null, "Su peso ideal es: " + pesoIdeal + " kg");
    }
}
