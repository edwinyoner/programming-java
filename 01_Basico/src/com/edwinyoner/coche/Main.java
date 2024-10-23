package com.edwinyoner.coche;

/**
 * Main.java
 *
 * Clase principal que prueba las funcionalidades del coche utilizando CocheControlador.
 *
 * @author Edwin Yoner
 * @version 19/10/2024
 */
public class Main {

    /**
     * Método principal que ejecuta la aplicación.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Crear un objeto de la clase Coche con la marca, modelo, año y color
        Coche miCoche = new Coche("Toyota", "Corolla", 2022, "Rojo");

        // Crear un objeto del controlador para gestionar las operaciones del coche
        CocheControlador cocheControlador = new CocheControlador();

        // Mostrar la información inicial del coche
        System.out.println("Información inicial del coche:");
        System.out.println(cocheControlador.obtenerInfo(miCoche));
        System.out.println();

        // Acelerar el coche en 50 km/h
        System.out.println("Acelerando el coche...");
        cocheControlador.acelerar(miCoche, 50);
        System.out.println();

        // Frenar el coche en 20 km/h
        System.out.println("Frenando el coche...");
        cocheControlador.frenar(miCoche, 20);
        System.out.println();

        // Cambiar el color del coche a "Azul"
        System.out.println("Cambiando el color del coche...");
        cocheControlador.cambiarColor(miCoche, "Azul");
        System.out.println();

        // Mostrar la información actualizada del coche
        System.out.println("Información actualizada del coche:");
        System.out.println(cocheControlador.obtenerInfo(miCoche));
    }
}
