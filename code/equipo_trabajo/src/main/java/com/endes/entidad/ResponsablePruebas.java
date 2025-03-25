package com.endes.entidad;
/**
 * Clase que representa a un Responsable de pruebas, hereda de la clase abstracta Personal.
 */
public class ResponsablePruebas extends Personal {
    private int bugsDetectados;

    /**
     * Constructor para crear un objeto ResponsablePruebas
     * @param dni
     * @param nombre
     * @param sueldoBase
     * @param bugsDetectados
     */
    public ResponsablePruebas(String dni, String nombre, double sueldoBase, int bugsDetectados) {
        super(dni, nombre, sueldoBase);
        setBugsDetectados(bugsDetectados);
    }

    /**
     * Devuelve los bugsDetectados del Responsable de Pruebas
     * @return los bugsDetectados como entero (int)
     */
    public int getBugsDetectados() {
        return bugsDetectados;
    }

    /**
     * Establece los bugsDetectados del Responsable de Pruebas
     * @param bugsDetectados
     */
    public void setBugsDetectados(int bugsDetectados) {
        if (bugsDetectados < 0) {
            throw new IllegalArgumentException("El número de bugs detectados no puede ser negativo.");
        }
        this.bugsDetectados = bugsDetectados;
    }
   
    /**
     * Calcula la productividad del Responsable de pruebas
     * El sueldo base se incrementa según la cantidad de bugsDetectados
     */
    @Override
    public double calcularProductividad() {
        return getSueldoBase() * (1 + 0.02 * bugsDetectados);
    }
}
