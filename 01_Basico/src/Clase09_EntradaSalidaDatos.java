import javax.swing.JOptionPane;

/**
 * Clase09_EntradaSalidaDatos.java
 *
 * Esta clase permite al usuario introducir su nombre y edad a través de cuadros de diálogo,
 * validando que la edad ingresada sea un valor numérico y esté dentro del rango de 0 a 100.
 * Si la entrada es inválida, se muestra un mensaje de error y se solicita nuevamente.
 * 
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase09_EntradaSalidaDatos {

    /**
     * Método principal que ejecuta la entrada de datos y la validación.
     *
     * @param args Los argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // Solicitar el nombre del usuario
        String nombre = "";
        boolean nombreValido = false;

        // Ciclo para validar que el nombre no contenga números
        while (!nombreValido) {
            nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor (solo letras y espacios):");
            // Validar que el nombre no contenga números ni caracteres especiales
            if (nombre.matches("^[a-zA-Z\\s]+$")) {
                nombreValido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error: El nombre no debe contener números ni caracteres especiales. Inténtalo de nuevo.");
            }
        }

        // Solicitar la edad del usuario con validación
        int edadUsuario = 0; // Inicializamos con un valor fuera del rango
        boolean edadValida = false;

        // Ciclo para validar que el usuario ingrese un número entero válido entre 0 y 100
        while (!edadValida) {
            String edadTexto = JOptionPane.showInputDialog("Introduce tu edad (debe ser un número entre 0 y 100):");

            // Manejo de posibles errores en la conversión de la edad
            try {
                edadUsuario = Integer.parseInt(edadTexto);
                // Validar si la edad está entre 0 y 100
                if (edadUsuario >= 0 && edadUsuario <= 100) {
                    edadValida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: La edad debe estar entre 0 y 100.");
                }
            } catch (NumberFormatException e) {
                // Si el usuario ingresa un valor no numérico, muestra un mensaje de error
                JOptionPane.showMessageDialog(null, "Error: Debes ingresar un número entero válido.");
            }
        }

        // Mostrar el mensaje en consola
        System.out.println("Hola " + nombre + ". El año que viene tendrás " + (edadUsuario + 1) + " años.");
    }
}
