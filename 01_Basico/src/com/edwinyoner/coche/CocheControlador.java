package com.edwinyoner.coche;

/**
 * CocheControlador.java
 *
 * Clase que proporciona métodos para interactuar con objetos de tipo Coche.
 * Permite mostrar la información del coche, acelerar, frenar y cambiar su color.
 *
 * @author Edwin Yoner
 * @version 19/10/2024
 */
public class CocheControlador {

    /**
     * Obtiene la información detallada de un coche en formato de cadena.
     *
     * @param coche El objeto Coche cuya información se desea obtener.
     * @return Una cadena con la marca, modelo, año, color y velocidad actual del coche.
     */
    public String obtenerInfo(Coche coche) {
        if (coche == null) {
            return "El coche no existe.";
        }
        return String.format("Marca: %s, Modelo: %s, Año: %d, Color: %s, Velocidad: %d km/h",
                coche.getMarca(), coche.getModelo(), coche.getAño(), coche.getColor(), coche.getVelocidad());
    }

    /**
     * Acelera el coche incrementando su velocidad en una cantidad especificada.
     *
     * @param coche      El objeto Coche al que se le va a aumentar la velocidad.
     * @param incremento La cantidad de kilómetros por hora en que se incrementará la velocidad.
     *                   Debe ser un valor positivo.
     * @throws IllegalArgumentException si el incremento es negativo.
     */
    public void acelerar(Coche coche, int incremento) {
        if (coche == null) {
            System.out.println("El coche no existe.");
            return;
        }
        if (incremento < 0) {
            throw new IllegalArgumentException("El incremento debe ser un valor positivo.");
        }

        int nuevaVelocidad = coche.getVelocidad() + incremento;
        coche.setVelocidad(nuevaVelocidad);
        System.out.println("El coche ha acelerado a " + nuevaVelocidad + " km/h.");
    }

    /**
     * Reduce la velocidad del coche en una cantidad especificada. Si la velocidad
     * resultante es menor que 0, se ajustará a 0.
     *
     * @param coche      El objeto Coche al que se le va a reducir la velocidad.
     * @param decremento La cantidad de kilómetros por hora en que se reducirá la velocidad.
     *                   Debe ser un valor positivo.
     * @throws IllegalArgumentException si el decremento es negativo.
     */
    public void frenar(Coche coche, int decremento) {
        if (coche == null) {
            System.out.println("El coche no existe.");
            return;
        }
        if (decremento < 0) {
            throw new IllegalArgumentException("El decremento debe ser un valor positivo.");
        }

        int nuevaVelocidad = coche.getVelocidad() - decremento;
        if (nuevaVelocidad < 0) {
            nuevaVelocidad = 0;
        }
        coche.setVelocidad(nuevaVelocidad);
        System.out.println("El coche ha frenado a " + nuevaVelocidad + " km/h.");
    }

    /**
     * Cambia el color del coche al color especificado.
     *
     * @param coche      El objeto Coche cuyo color será cambiado.
     * @param nuevoColor El nuevo color que se asignará al coche.
     * @throws IllegalArgumentException si el nuevoColor es nulo o está vacío.
     */
    public void cambiarColor(Coche coche, String nuevoColor) {
        if (coche == null) {
            System.out.println("El coche no existe.");
            return;
        }
        if (nuevoColor == null || nuevoColor.trim().isEmpty()) {
            throw new IllegalArgumentException("El color no puede ser nulo o vacío.");
        }

        coche.setColor(nuevoColor);
        System.out.println("El color del coche ahora es " + nuevoColor + ".");
    }
}
