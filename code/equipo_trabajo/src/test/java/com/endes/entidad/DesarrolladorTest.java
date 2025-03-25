package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class DesarrolladorTest {

	private Desarrollador desarrollador;
	
	@BeforeEach
	void setUp() throws Exception {
		desarrollador = new Desarrollador("11111111H", "Sandra", 1000.00, "Java");
	}
	
	@Test
	@DisplayName("Validación Método getDNI")
	void testGetDNI() {
		String valorEsperado = "11111111H";
		String valorResultado = desarrollador.getDni();
		assertEquals(valorEsperado, valorResultado);
	}
	
	@Test
	@DisplayName("Validación Método getNombre")
	void testGetNombre() {
		String valorEsperado = "Sandra";
		String valorResultado = desarrollador.getNombre();
		assertEquals(valorEsperado, valorResultado);
	}
	
	@Test
	@DisplayName("Validación Método getSueldoBase")
	void testGetSueldoBase() {
		double valorEsperado = 1000.00;
		double valorResultado = desarrollador.getSueldoBase();
		assertEquals(valorEsperado, valorResultado);
	}
	
	@Test
	@DisplayName("Validación Método setSueldoBase")
	void testSetSueldoBase() {
		double valorEsperado = 1500.00;
		desarrollador.setSueldoBase(valorEsperado);
		double valorResultado = desarrollador.getSueldoBase();
		assertEquals(valorEsperado, valorResultado);
	}
	
	@Test
	@DisplayName("Validación Método setSueldoBase si un precio es negativo")
	void testSetSueldoBaseNegativo() {
		double sueldoNegativo = -500.00;
		Exception exception = assertThrows(IllegalArgumentException.class, ()-> desarrollador.setSueldoBase(sueldoNegativo));
		String mensajeEsperado = "El sueldo base no puede ser negativo.";
		assertEquals(mensajeEsperado, exception.getMessage());
	}
	
	@Test
	@DisplayName("Validación Método getLenguajePrincipal")
	void testGetLenguajePrincipal() {
		String valorEsperado = "Java";
		String valorResultado = desarrollador.getLenguajePrincipal();
		assertEquals(valorEsperado, valorResultado);
	}
	
	@Test
	@DisplayName("Validación Método calcularProductividad cuando el lenguaje es 'Java' o 'Python'")
	void testCalcularProductividad() {
		double valorEsperado = 1100.00;
		double valorResultado = desarrollador.calcularProductividad();
		assertEquals(valorEsperado, valorResultado);
	}
	
	@Test
	@DisplayName("Validación Método calcularProductividad cuando el lenguaje no es 'Java' o 'Python'")
	void testCalcularProductividadGo() {
		String lenguaje = "Go";
		desarrollador.setLenguajePrincipal(lenguaje);
		double valorEsperado = 1000.00;
		double valorResultado = desarrollador.calcularProductividad();
		assertEquals(valorEsperado, valorResultado);
	}
}