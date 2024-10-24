package com.edwinyoner.persona;

/**
 * Persona.java
 * 
 * Representa a una persona con nombre, edad y género.
 * Además, cuenta el número total de personas creadas mediante el uso de una propiedad estática.
 * También permite mostrar información detallada de cada persona, incluyendo su número en la lista de creación.
 * 
 * @author Edwin Yoner
 * @version 24/10/2024
 */
public class Persona {

    // Propiedades de la clase
    private String nombre;
    private int edad;
    private String genero;
    private int numeroPersona;  // Propiedad para enumerar a cada persona

    // Propiedad estática para contar el número de personas creadas
    private static int contadorPersonas = 0;

    /**
     * Constructor por defecto.
     * 
     * Crea una persona con valores por defecto: nombre "Desconocido", edad 0 y género "No especificado".
     */
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.genero = "No especificado";
        incrementarContador();
    }

    /**
     * Constructor que recibe solo el nombre.
     * 
     * @param nombre El nombre de la persona.
     */
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.genero = "No especificado";
        incrementarContador();
    }

    /**
     * Constructor que recibe el nombre y la edad.
     * 
     * @param nombre El nombre de la persona.
     * @param edad   La edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = "No especificado";
        incrementarContador();
    }

    /**
     * Constructor que recibe el nombre, la edad y el género.
     * 
     * @param nombre El nombre de la persona.
     * @param edad   La edad de la persona.
     * @param genero El género de la persona.
     */
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        incrementarContador();
    }

    /**
     * Incrementa el contador de personas creadas y asigna el número correspondiente a la persona.
     */
    private void incrementarContador() {
        contadorPersonas++;
        this.numeroPersona = contadorPersonas;  // Asignar el número de persona
    }

    /**
     * Método estático para obtener el número total de personas creadas.
     * 
     * @return El total de personas creadas.
     */
    public static int obtenerTotalPersonas() {
        return contadorPersonas;
    }

    // Métodos getter y setter

    /**
     * Devuelve el nombre de la persona.
     * 
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre El nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la edad de la persona.
     * 
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     * 
     * @param edad La edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve el género de la persona.
     * 
     * @return El género de la persona.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género de la persona.
     * 
     * @param genero El género de la persona.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Método que devuelve la información completa de la persona, incluyendo su número.
     * 
     * @return Información detallada de la persona (número, nombre, edad, género).
     */
    public String obtenerInfo() {
        return "Persona #" + numeroPersona + " - Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero;
    }
}
