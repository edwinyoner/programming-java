/**
 * Clase20_Arrays.java
 *
 * Esta clase muestra cómo inicializar y recorrer un array tridimensional.
 * 
 * @author Edwin Yoner
 * @version 14/10/2024
 */
public class Clase20_Arrays {

    /**
     * Método principal que inicializa y muestra un array de tres dimensiones.
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Declaración e inicialización de un array de 3 dimensiones [3][3][3]
        int[][][] array3D = new int[3][3][3];

        // Asignación de valores al array tridimensional
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = i + j + k;  // Ejemplo de asignación
                }
            }
        }

        // Mostrar los valores del array tridimensional
        System.out.println("Valores del array tridimensional:");
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.println("array3D[" + i + "][" + j + "][" + k + "] = " + array3D[i][j][k]);
                }
            }
        }
    }
}
