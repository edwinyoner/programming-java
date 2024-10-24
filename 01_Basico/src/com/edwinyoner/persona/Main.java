package com.edwinyoner.persona;

/**
 * Main.java
 * 
 * Esta clase contiene el método principal que se encarga de crear instancias de la clase Persona,
 * mostrar la información de cada persona y mostrar el total de personas creadas.
 * 
 * @author Edwin Yoner
 * @version 24/10/2024
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método crea varias instancias de la clase Persona utilizando diferentes constructores,
     * muestra la información detallada de cada persona (incluyendo el número asignado a cada una) 
     * y finalmente imprime el número total de personas creadas.
     * 
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Crear varias instancias de la clase Persona
        Persona persona1 = new Persona();  // Utiliza el constructor por defecto
        Persona persona2 = new Persona("Edwin");  // Utiliza el constructor con solo nombre
        Persona persona3 = new Persona("Yoner", 25);  // Utiliza el constructor con nombre y edad
        Persona persona4 = new Persona("Margarita", 50, "Femenino");  // Utiliza el constructor con nombre, edad y género

        // Mostrar información de cada persona
        System.out.println(persona1.obtenerInfo());  // Información de persona1
        System.out.println(persona2.obtenerInfo());  // Información de persona2
        System.out.println(persona3.obtenerInfo());  // Información de persona3
        System.out.println(persona4.obtenerInfo());  // Información de persona4

        // Mostrar el total de personas creadas
        System.out.println("Total de personas creadas: " + Persona.obtenerTotalPersonas());
    }
}
