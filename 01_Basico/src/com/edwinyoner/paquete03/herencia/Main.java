package com.edwinyoner.paquete03.herencia;

/**
 * Clase Main que ejecuta el programa.
 * 
 * Esta clase crea instancias de Persona, Estudiante y Profesor, y muestra la información de cada una.
 * 
 * @author Edwin Yoner
 * @version 24/10/2024
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método crea instancias de las clases Persona, Estudiante y Profesor
     * para mostrar la aplicación de la herencia y el polimorfismo.
     * 
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Ana", 30, "Femenino");
        System.out.println(persona.obtenerInfo());

        // Crear una instancia de Estudiante
        Estudiante estudiante = new Estudiante("Carlos", 20, "Masculino", "E12345");
        System.out.println(estudiante.obtenerInfo());

        // Crear una instancia de Profesor
        Profesor profesor = new Profesor("Luis", 45, "Masculino", "Matemáticas");
        System.out.println(profesor.obtenerInfo());
    }
}
