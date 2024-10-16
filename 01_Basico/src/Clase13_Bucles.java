import javax.swing.*;

/**
 * Clase13_Bucles.java
 *
 * Esta clase permite al usuario intentar acceder a un sistema introduciendo una contraseña.
 * Se limitan los intentos a 3 y se notifica al usuario en caso de contraseñas incorrectas.
 * 
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase13_Bucles {

    /**
     * Método principal que ejecuta el programa de acceso por contraseña.
     * Solicita al usuario que ingrese una contraseña y controla el acceso
     * permitiendo un máximo de tres intentos.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        
        // Definición de la clave y variables de control
        String clave = "Edwin";
        String pass = "";
        int intentos = 0;
        int maxIntentos = 3;
        
        // Bucle que se repite mientras la contraseña no sea correcta y no se excedan los intentos
        while (!(clave.equals(pass)) && intentos < maxIntentos) {
            pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
            
            if (pass == null) {
                // Si el usuario cancela el cuadro de diálogo, el programa termina
                System.out.println("Operación cancelada. Saliendo...");
                return;  // Salida del programa
            }

            // Si la contraseña es incorrecta
            if (!(clave.equals(pass))) {
                intentos++;
                System.out.println("Contraseña incorrecta. Intentos restantes: " + (maxIntentos - intentos));
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Intentos restantes: " + (maxIntentos - intentos), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Resultado final después de salir del bucle
        if (clave.equals(pass)) {
            System.out.println("Contraseña correcta. Acceso permitido");
            JOptionPane.showMessageDialog(null, "Contraseña correcta. Acceso permitido", "Acceso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Demasiados intentos fallidos. Acceso denegado.");
            JOptionPane.showMessageDialog(null, "Demasiados intentos fallidos. Acceso denegado.", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
        }
    }
}
