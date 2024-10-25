package com.edwinyoner.paquete03.herencia;

/**
 * Profesor.java
 * 
 * Clase Profesor que hereda de Persona.
 * Representa a un profesor, que es una persona con propiedades adicionales como la especialidad.
 * 
 * @author Edwin Yoner
 * @version 24/10/2024
 */
public class Profesor extends Persona {
    private String especialidad;

    /**
     * Constructor por defecto de Profesor.
     * Inicializa los atributos del profesor con valores predeterminados.
     */
    public Profesor() {
        super();
        this.especialidad = "Sin especialidad";
    }

    /**
     * Constructor con parámetros para Profesor.
     * Inicializa los atributos del profesor y llama al constructor de Persona.
     * 
     * @param nombre Nombre del profesor.
     * @param edad Edad del profesor.
     * @param genero Género del profesor.
     * @param especialidad Especialidad del profesor.
     */
    public Profesor(String nombre, int edad, String genero, String especialidad) {
        super(nombre, edad, genero);  // Llamada al constructor de Persona
        this.especialidad = especialidad;
    }

    /**
     * Método para obtener la información del profesor.
     * Sobrescribe el método de Persona para incluir la especialidad del profesor.
     * 
     * @return Cadena de texto con la información del profesor.
     */
    @Override
    public String obtenerInfo() {
        return super.obtenerInfo() + ", Especialidad: " + especialidad;
    }
}
