import javax.swing.JOptionPane;

/**
 * Clase10_EntradaSalidaDatos.java
 *
 * Esta clase permite al usuario introducir un número y calcula su raíz cuadrada,
 * validando que la entrada sea válida y que el número no sea negativo.
 * 
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase10_EntradaSalidaDatos {

    /**
     * Método principal que ejecuta la entrada de datos y la validación.
     *
     * @param args Los argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // Ciclo para asegurarse de que el usuario ingrese un número válido
        while (true) {
            try {
                // Solicitar número del usuario
                String inputNumero = JOptionPane.showInputDialog("Introduce un número (o 'cancelar' para salir):");
                
                // Si el usuario cancela, se termina el programa
                if (inputNumero == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada. Saliendo del programa.");
                    return;
                }

                // Validar que no se introduzcan valores vacíos o espacios
                if (inputNumero.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "La entrada no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; // Vuelve a solicitar el número
                }

                // Convertir la entrada a número de tipo double
                double numero = Double.parseDouble(inputNumero);

                // Verificar si el número es negativo
                if (numero < 0) {
                    JOptionPane.showMessageDialog(null, "El número no puede ser negativo.");
                } else {
                    // Calcular la raíz cuadrada y mostrarla
                    double raizCuadrada = Math.sqrt(numero);
                    System.out.println("La raíz de " + numero + " es: " + String.format("%.2f", raizCuadrada));
                    break; // Salir del bucle si la operación es exitosa
                }

            } catch (NumberFormatException e) {
                // Capturar excepciones si la entrada no es un número válido
                JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor, introduce un número.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
