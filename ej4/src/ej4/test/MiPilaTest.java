package ej4.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modules.MiPila;

class MiPilaTest extends MiPila {

	MiPila miPila;

	
	@BeforeEach
	void setUp() throws Exception {
		miPila = new MiPila();
		miPila.push("manzana");
		miPila.push("plátano");
		miPila.push("fresa");
		miPila.push("pera");
	}

	@AfterEach
	void tearDown() throws Exception {
		miPila = null;
	}

	@Test
	final void testPop() {
		assertEquals("pera", miPila.pop());
	}

	@Test
	final void testPush() {
		miPila.push("uva");
		assertEquals(5, miPila.getList().size());
	}

	@Test
	final void testPeek() {
		assertEquals("pera", miPila.peek());
		assertEquals(4, miPila.getList().size());	
	}

	@Test
	final void testReverse() {
		List<String> listaInvertida = new ArrayList<>();
		listaInvertida.add("pera");
		listaInvertida.add("fresa");
		listaInvertida.add("plátano");
		listaInvertida.add("manzana");
		miPila.reverse();
		
		assertEquals(listaInvertida, miPila.getList());
	}

}
