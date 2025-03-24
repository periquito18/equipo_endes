package com.endes.entidad;
/**
 * Clase que representa a un Responsable de Pruebas en un equipo de desarrollo.
 * Hereda de la clase abstracta Personal.
 * 
 * Su productividad se calcula como el sueldo base incrementado en un 2% por cada bug detectado.
 * 
 * Este rol se encarga de garantizar la calidad del software mediante la detección de errores.
 * 
 * @author 
 */
public class ResponsablePruebas extends Personal {
    private int bugsDetectados;

    /**
     * Constructor para crear un Responsable de Pruebas.
     * 
     * @param dni             Documento de identidad
     * @param nombre          Nombre del responsable
     * @param sueldoBase      Sueldo base
     * @param bugsDetectados  Número de errores detectados
     * @throws IllegalArgumentException si bugsDetectados es negativo
     */
    public ResponsablePruebas(String dni, String nombre, double sueldoBase, int bugsDetectados) {
        super(dni, nombre, sueldoBase);
        setBugsDetectados(bugsDetectados);
    }

    /**
     * Devuelve el número de bugs detectados por este responsable.
     * 
     * @return cantidad de errores detectados
     */
    public int getBugsDetectados() {
        return bugsDetectados;
    }

    /**
     * Establece el número de bugs detectados.
     * 
     * @param bugsDetectados número de errores
     * @throws IllegalArgumentException si el número es negativo
     */
    public void setBugsDetectados(int bugsDetectados) {
        if (bugsDetectados < 0) {
            throw new IllegalArgumentException("El número de bugs detectados no puede ser negativo.");
        }
        this.bugsDetectados = bugsDetectados;
    }

    /**
     * Calcula la productividad del responsable.
     * Por cada bug detectado, se suma un 2% al sueldo base.
     * 
     * @return productividad final
     */
    @Override
    public double calcularProductividad() {
        return getSueldoBase() * (1 + 0.02 * bugsDetectados);
    }
}
