package ej4.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modules.MiPila;

class MiPilaTest extends MiPila<Object> {

	MiPila<String> miLista;

	@BeforeEach
	void setUp() throws Exception {
		miLista = new MiPila<String>();
		miLista.push("manzana");
		miLista.push("plátano");
		miLista.push("fresa");
		miLista.push("pera");
	}

	@AfterEach
	void tearDown() throws Exception {
		miLista = null;
	}

	@Test
	final void testPop() {
		assertEquals("pera", miLista.pop());
	}
	
	@Test
	final void testPopRemove() {
		miLista.pop();
		assertEquals(3, miLista.getList().size());
	}

	@Test
	final void testPush() {
		miLista.push("uva");
		assertEquals(5, miLista.getList().size());
	}

	@Test
	final void testPeek() {
		assertEquals("pera", miLista.peek());
		assertEquals(4, miLista.getList().size());	
	}

	@Test
	final void testReverse() {
		List<String> listaInvertida = new ArrayList<>();
		listaInvertida.add("pera");
		listaInvertida.add("fresa");
		listaInvertida.add("plátano");
		listaInvertida.add("manzana");
		miLista.reverse();	
		assertEquals(listaInvertida, miLista.getList());
	}

}
