package planetas.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modules.Planetas;

class PlanetaTest {
	List<Planetas> planetas;
	
	@BeforeEach
	void setUp() throws Exception {
		planetas = new ArrayList<Planetas>();
	}

	@AfterEach
	void tearDown() throws Exception {
		planetas = null;
	}

	@Test
	final void testGetNombreMercurio() {
		assertEquals("Mercurio", Planetas.MERCURIO.getNombre());
	}

	@Test
	final void testSetNombre() {
		Planetas.TIERRA.setNombre("La Tierra");
		assertEquals("La Tierra", Planetas.TIERRA.getNombre());
	}

	@Test
	final void testGetMasaMercurio() {
		assertEquals(3.303e+23, Planetas.MERCURIO.getMasa());
	}

	@Test
	final void testSetMasaTierra() {
		Planetas.TIERRA.setMasa(45);
		assertEquals(45, Planetas.TIERRA.getMasa());
	}

	@Test
	final void testGetRadioMercurio() {
		assertEquals(2.4397e6,Planetas.MERCURIO.getRadio());
	}

	@Test
	final void testSetRadio() {
		Planetas.TIERRA.setRadio(45);
		assertEquals(45, Planetas.TIERRA.getRadio());
	}

	@Test
	final void testPlanetasSonOcho() {
		assertEquals(8, Planetas.values().length);
	}
}
