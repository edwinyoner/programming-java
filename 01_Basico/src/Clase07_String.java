/**
 * Clase07_String.java
 *
 * Esta clase demuestra la comparación de cadenas en Java utilizando los métodos 
 * `equals` y `equalsIgnoreCase`. Se compara si dos nombres son iguales tanto 
 * teniendo en cuenta las mayúsculas como ignorándolas.
 *
 * @author Edwin Yoner
 * @version 12/10/2024
 */
public class Clase07_String {

    /**
     * Método principal que ejecuta la comparación de nombres de alumnos.
     *
     * @param args Los argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        
        // Definir los nombres de los alumnos
        String alumno1 = "David";
        String alumno2 = "david";
        
        // Comparar sin ignorar mayúsculas y minúsculas
        boolean sonIguales = alumno1.equals(alumno2);
        // Comparar ignorando mayúsculas y minúsculas
        boolean sonIgualesIgnorandoCase = alumno1.equalsIgnoreCase(alumno2);
        
        // Mostrar los resultados
        System.out.println("Comparación exacta (case-sensitive): " + sonIguales);
        System.out.println("Comparación ignorando mayúsculas/minúsculas: " + sonIgualesIgnorandoCase);
    }
}
