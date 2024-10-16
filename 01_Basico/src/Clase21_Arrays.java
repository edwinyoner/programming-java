/**
 * Clase21_Arrays.java
 * 
 * Esta clase demuestra el uso de un array bidimensional para calcular y mostrar el 
 * saldo acumulado de una inversión inicial de 10,000 unidades de dinero a lo largo 
 * de 5 años, utilizando diferentes tasas de interés que aumentan progresivamente.
 * 
 * El interés inicial es del 10%, y se incrementa en un 1% en cada fila del array.
 * El programa calcula el saldo acumulado para cada tasa de interés y lo muestra 
 * en formato tabular.
 * 
 * @author Edwin Yoner
 * @version 14/10/2024
 */
public class Clase21_Arrays {

    /**
     * El método principal del programa. Calcula los saldos acumulados año tras año 
     * para diferentes tasas de interés y los imprime en la consola.
     *
     * Se utiliza un array bidimensional donde:
     * - Las filas representan diferentes tasas de interés.
     * - Las columnas representan los años (5 años en total).
     *
     * El interés inicial es del 10% y aumenta en 1% por cada fila.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {

        // Constante para el saldo inicial
        final double SALDO_INICIAL = 10000;

        // Número de filas (representan las diferentes tasas de interés)
        final int NUM_TASAS_INTERES = 6;

        // Número de columnas (representan los años)
        final int NUM_AÑOS = 5;

        // Variables para almacenar el saldo acumulado y la tasa de interés inicial
        double acumulado;
        double interes = 0.10;

        // Array bidimensional para almacenar los saldos acumulados
        double saldo[][] = new double[NUM_TASAS_INTERES][NUM_AÑOS];

        // Cálculo del saldo acumulado año por año
        for (int i = 0; i < NUM_TASAS_INTERES; i++) {
            saldo[i][0] = SALDO_INICIAL; // Saldo inicial para el primer año
            acumulado = SALDO_INICIAL;
            
            // Cálculo del saldo acumulado para cada año
            for (int j = 1; j < NUM_AÑOS; j++) {
                acumulado += acumulado * interes; // Incremento por interés
                saldo[i][j] = acumulado; // Almacena el saldo acumulado
            }

            // Incrementa la tasa de interés para la siguiente fila
            interes += 0.01;
        }

        // Imprimir los resultados de los saldos acumulados
        System.out.println("Saldos acumulados:");
        for (int z = 0; z < NUM_AÑOS; z++) {
            System.out.printf("Año %d: ", z);
            for (int h = 0; h < NUM_TASAS_INTERES; h++) {
                System.out.printf("%1.2f ", saldo[h][z]); // Imprime con dos decimales
            }
            System.out.println(); // Nueva línea para mejor legibilidad
        }
    }
}
