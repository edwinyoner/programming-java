package com.edwinyoner.paquete03.herencia;

/**
 * Persona.java
 * 
 * Representa una persona con propiedades básicas como nombre, edad y género.
 * Es la clase base para otras clases que hereden de ella.
 * 
 * @author Edwin Yoner
 * @version 24/10/2024
 */
public class Persona {
    protected String nombre;
    protected int edad;
    protected String genero;

    /**
     * Constructor por defecto de Persona.
     * Inicializa los atributos con valores predeterminados.
     */
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.genero = "No especificado";
    }

    /**
     * Constructor con parámetros.
     * Permite inicializar los atributos de Persona con valores específicos.
     * 
     * @param nombre Nombre de la persona.
     * @param edad Edad de la persona.
     * @param genero Género de la persona.
     */
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    /**
     * Método para obtener la información de la persona.
     * 
     * @return Cadena de texto con la información de la persona.
     */
    public String obtenerInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero;
    }
}
