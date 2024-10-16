import javax.swing.JOptionPane;

/**
 * Clase16_Bucles.java
 *
 * Esta clase verifica si un correo electrónico ingresado por el usuario tiene un formato válido.
 * Para ser considerado válido, debe tener exactamente un '@', al menos un punto '.' después del '@',
 * y debe tener texto antes y después de estos símbolos.
 * 
 * @author Edwin Yoner
 * @version 14/10/2024
 */
public class Clase16_Bucles {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Solicita al usuario que ingrese un correo electrónico y lo verifica para asegurarse
     * de que tiene un formato válido: exactamente un '@' y al menos un '.' después de este.
     * 
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        String correo = "";
        boolean formatoValido = false;

        // Solicitar el correo electrónico hasta que el usuario ingrese un formato válido
        while (!formatoValido) {
            correo = JOptionPane.showInputDialog("Ingrese su correo electrónico:");
            
            // Verificar si el usuario canceló o dejó en blanco
            if (correo == null || correo.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El correo no puede estar vacío. Inténtalo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                continue; // Volver a solicitar el correo
            }
            
            // Validar el formato del correo
            formatoValido = esCorreoValido(correo);
            
            if (!formatoValido) {
                JOptionPane.showMessageDialog(null, "Correo inválido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Si el formato es válido, mostrar mensaje de éxito
        JOptionPane.showMessageDialog(null, "El correo " + correo + " es correcto.", "Validación exitosa", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método que valida el formato de un correo electrónico.
     * Un correo válido debe contener exactamente un '@', al menos un '.' después del '@',
     * y debe tener texto antes y después de estos símbolos.
     * 
     * @param correo El correo ingresado por el usuario
     * @return true si el correo tiene un formato válido, false en caso contrario
     */
    public static boolean esCorreoValido(String correo) {
        int posicionArroba = correo.indexOf('@');
        int posicionPunto = correo.lastIndexOf('.');

        // Verificar que '@' y '.' existan, y que '@' esté antes del '.'
        if (posicionArroba > 0 && posicionPunto > posicionArroba + 1 && posicionPunto < correo.length() - 1) {
            return true;
        }
        return false;
    }
}
