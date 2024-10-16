/**
 * Clase18_Arrays.java
 *
 * Esta clase muestra ejemplos de cómo inicializar y recorrer arrays en Java.
 * 
 * @author Edwin Yoner
 * @version 14/10/2024
 */
public class Clase18_Arrays {

	/**
	 * Método principal que contiene ejemplos de arrays.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Inicialización de un array con tamaño 10, pero solo se asignan 5 valores
		int[] numeros = new int[10];

		numeros[0] = 5;
		numeros[1] = 38;
		numeros[2] = -15;
		numeros[3] = 92;
		numeros[4] = 71;

		// Mostrar los valores del array que han sido inicializados (primeros 5
		// elementos)
		System.out.println("Elementos del array 'numeros':");
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor en el índice " + i + " = " + numeros[i]);
		}

		// Inicialización directa de un array con valores predefinidos
		int[] impares = { 1, 3, 5, 7, 9, 11 };

		// Recorrer el array 'impares' utilizando un bucle for tradicional
		System.out.println("\nElementos del array 'impares' (con bucle for):");
		for (int i = 0; i < impares.length; i++) {
			System.out.println("Valor en el índice " + i + " = " + impares[i]);
		}

		// Recorrer el array 'impares' utilizando un bucle for-each
		System.out.println("\nElementos del array 'impares' (con bucle for-each):");
		for (int numero : impares) {
			System.out.println("Valor = " + numero);
		}

		// Inicialización de un array para almacenar 10 países
		String[] paises = new String[10];

		// Asignación de valores a algunas posiciones del array
		paises[0] = "Perú";
		paises[1] = "Argentina";
		paises[2] = "Brasil";
		paises[3] = "Colombia";
		paises[4] = "Chile";
		paises[5] = "México";
		paises[6] = "España";
		paises[7] = "Francia";
		paises[8] = "Alemania";
		paises[9] = "Japón";

		// Mostrar los valores utilizando un bucle 'for' tradicional
		System.out.println("\nListado de países (con bucle for):");
		for (int i = 0; i < paises.length; i++) {
			System.out.println("País en el índice " + i + ": " + paises[i]);
		}

		// Mostrar los valores utilizando un bucle 'for-each'
		System.out.println("\nListado de países (con bucle for-each):");
		for (String pais : paises) {
			System.out.println("País: " + pais);
		}
	}
}
