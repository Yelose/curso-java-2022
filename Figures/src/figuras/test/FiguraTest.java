package figuras.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Figura;
import figuras.exceptions.FiguraException;

class FiguraTest {

	Cuadrado cuaVacio;
	Cuadrado cuaLleno;
	Circulo cirVacio;
	Circulo cirLleno;
	
	List<Figura> figurasList;
	Set<Figura> figurasSet;
	
	@BeforeEach
	void setUp() throws Exception {
		cuaVacio = new Cuadrado();
		cuaLleno = new Cuadrado("cuadrado", 10);
		
		cirVacio = new Circulo();
		cirLleno = new Circulo("circulo", 10);
		
		figurasList = new ArrayList<>();
		figurasList.add(cuaVacio);
		figurasList.add(cuaLleno);
		figurasList.add(cirVacio);
		figurasList.add(cirLleno);
		figurasList.add(new Cuadrado("cuadrado 2", 15));
		figurasList.add(new Circulo("circulo 2", 15));
		
		figurasSet = new HashSet<>();
		figurasSet.add(cuaVacio);
		figurasSet.add(cuaLleno);
		figurasSet.add(cirVacio);
		figurasSet.add(cirLleno);
		figurasSet.add(new Cuadrado("cuadrado 2", 15));
		figurasSet.add(new Circulo("circulo 2", 15));
	}

	@AfterEach
	void tearDown() throws Exception {
		cuaVacio = null;
		cuaLleno = null;
		cirVacio = null;
		cirLleno = null;
		figurasList = null;
		figurasSet = null;
		
		Figura.clear();
	}

	@Test
	void testCuadradoLlenoGetNombre() {
		assertEquals("cuadrado", cuaLleno.getNombre());
	}
	
	@Test
	void testCuadradoLlenoGetLado() {
		assertEquals(10, cuaLleno.getLado(), 0.001);
	}
	
	@Test
	void testCuadradoPerimetro() {
		assertEquals(40, cuaLleno.calcularPerimetro());
	}
	
	@Test
	void testCuadradoSuperficie() {
		assertEquals(100, cuaLleno.calcularSuperficie());
	}
	
	@Test
	void testCuadradoEstaEnLaLista() {
		try {
			assertTrue(figurasList.contains(new Cuadrado("cuadrado", 10)));
		} catch (FiguraException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test
	void testCuadradoNoEstaEnLaLista() {
		try {
			assertFalse(figurasList.contains(new Cuadrado("cuadradito", 10)));
		} catch (FiguraException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}
	
	@Test
	void testCuadradoEqualsListCantidad() {
		figurasList.add(new Cuadrado());
		assertEquals(7, figurasList.size());
	}
	
	@Test
	void testCuadradoSetNoAgregaDuplicados() {
		try {
			figurasSet.add(new Cuadrado("cuadrado", 10));
		} catch (FiguraException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		assertEquals(6, figurasSet.size());
	}
	
	@Test
	void testCuadradoEqualsTrue() {
		Cuadrado miCuadrado = null;
		try {
			miCuadrado = new Cuadrado("cuadrado", 10);
		} catch (FiguraException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		assertTrue(cuaLleno.equals(miCuadrado));
	}
	
	@Test
	void testCuadradoEqualsFalse() {
		Cuadrado miCuadrado = null;
		try {
			miCuadrado = new Cuadrado("cuadradito", 15);
		} catch (FiguraException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		assertFalse(cuaLleno.equals(miCuadrado));
	}
	
	@Test 
	void testCuadradoFiguraException() {
		Cuadrado cua = new Cuadrado();
		
		System.out.println("Lista de figuras:");
		System.out.println(figurasList);
		System.out.println("cuadrado lleno:" + cuaLleno);
		try {
			cua.setLado(-10);
		} catch (FiguraException e) {
			assertEquals("el valor del lado no puede ser negativo, no tiene sentido", e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	void testCantidadDeObjetos() {
		assertEquals(8, Figura.getCantidadDeFiguras());
	}
	
	@Test
	void testCantidadDeObjetos10() {
		Cuadrado cua = new Cuadrado();		
		Cuadrado cua2 = new Cuadrado();
		assertEquals(10, Figura.getCantidadDeFiguras());
	}
}
