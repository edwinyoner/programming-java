package com.edwinyoner.paquete03.herencia;

/**
 * Estudiante.java
 * 
 * Clase Estudiante que hereda de Persona.
 * Representa a un estudiante, que es una persona con propiedades adicionales como el ID de estudiante.
 * 
 * @author Edwin Yoner
 * @version 24/10/2024
 */
public class Estudiante extends Persona {
    private String idEstudiante;

    /**
     * Constructor por defecto de Estudiante.
     * Inicializa los atributos del estudiante con valores predeterminados.
     */
    public Estudiante() {
        super();
        this.idEstudiante = "Sin ID";
    }

    /**
     * Constructor con parámetros para Estudiante.
     * Inicializa los atributos del estudiante y llama al constructor de Persona.
     * 
     * @param nombre Nombre del estudiante.
     * @param edad Edad del estudiante.
     * @param genero Género del estudiante.
     * @param idEstudiante ID del estudiante.
     */
    public Estudiante(String nombre, int edad, String genero, String idEstudiante) {
        super(nombre, edad, genero);  // Llamada al constructor de Persona
        this.idEstudiante = idEstudiante;
    }

    /**
     * Método para obtener la información del estudiante.
     * Sobrescribe el método de Persona para incluir el ID del estudiante.
     * 
     * @return Cadena de texto con la información del estudiante.
     */
    @Override
    public String obtenerInfo() {
        return super.obtenerInfo() + ", ID Estudiante: " + idEstudiante;
    }
}
