package com.edwinyoner.coche;

/**
 * Coche.java
 *
 * Clase que representa un coche con atributos como marca, modelo, año, color, y velocidad.
 * Proporciona métodos para obtener y modificar estos atributos.
 *
 * @author Edwin Yoner
 * @version 19/10/2024
 */
public class Coche {

    // Atributos del coche
    private final String marca;  // La marca del coche
    private final String modelo; // El modelo del coche
    private final int año;       // El año de fabricación del coche
    private String color;        // El color del coche
    private int velocidad;       // La velocidad actual del coche en km/h

    /**
     * Constructor que inicializa un objeto Coche con la marca, modelo, año y color especificados.
     * La velocidad inicial del coche es 0.
     *
     * @param marca   La marca del coche.
     * @param modelo  El modelo del coche.
     * @param año     El año de fabricación del coche.
     * @param color   El color inicial del coche.
     * @throws IllegalArgumentException si alguno de los parámetros es inválido.
     */
    public Coche(String marca, String modelo, int año, String color) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede ser nula o vacía.");
        }
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede ser nulo o vacío.");
        }
        if (año <= 0) {
            throw new IllegalArgumentException("El año debe ser un valor positivo.");
        }
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("El color no puede ser nulo o vacío.");
        }
        
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.velocidad = 0; // Velocidad inicial en 0 km/h
    }

    /**
     * Obtiene la marca del coche.
     *
     * @return La marca del coche.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el modelo del coche.
     *
     * @return El modelo del coche.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtiene el año de fabricación del coche.
     *
     * @return El año del coche.
     */
    public int getAño() {
        return año;
    }

    /**
     * Obtiene el color actual del coche.
     *
     * @return El color del coche.
     */
    public String getColor() {
        return color;
    }

    /**
     * Modifica el color del coche.
     *
     * @param color El nuevo color del coche.
     * @throws IllegalArgumentException si el color es nulo o vacío.
     */
    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("El color no puede ser nulo o vacío.");
        }
        this.color = color;
    }

    /**
     * Obtiene la velocidad actual del coche.
     *
     * @return La velocidad del coche en km/h.
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Modifica la velocidad del coche.
     *
     * @param velocidad La nueva velocidad del coche en km/h.
     * @throws IllegalArgumentException si la velocidad es negativa.
     */
    public void setVelocidad(int velocidad) {
        if (velocidad < 0) {
            throw new IllegalArgumentException("La velocidad no puede ser negativa.");
        }
        this.velocidad = velocidad;
    }
}
