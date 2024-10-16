/**
 * Clase19_Arrays.java
 *
 * Esta clase muestra cómo inicializar y recorrer un array bidimensional.
 * 
 * @author Edwin Yoner
 * @version 14/10/2024
 */
public class Clase19_Arrays {

    /**
     * Método principal que inicializa y muestra un array bidimensional.
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Declaración e inicialización de un array de 2 dimensiones [3][4]
        int[][] array2D = new int[3][4];

        // Asignación de valores al array bidimensional
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = i * j;  // Ejemplo de asignación
            }
        }

        // Mostrar los valores del array bidimensional
        System.out.println("Valores del array bidimensional:");
        for (int i = 0; i < array2D.length; i++) {
        	System.out.println("");
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(" [" + i + "][" + j + "] = " + array2D[i][j]);
            }
        }
    }
}
