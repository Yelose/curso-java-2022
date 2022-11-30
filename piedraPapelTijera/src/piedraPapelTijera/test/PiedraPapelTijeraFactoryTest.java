package piedraPapelTijera.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.edu.capgemini.piedrapapeltijera.modelo.Papel;
import es.edu.capgemini.piedrapapeltijera.modelo.Piedra;
import es.edu.capgemini.piedrapapeltijera.modelo.PiedraPapelTijeraFactory;
import es.edu.capgemini.piedrapapeltijera.modelo.Tijera;

class PiedraPapelTijeraFactoryTest {

	PiedraPapelTijeraFactory piedra, papel, tijera;
	
	@BeforeEach
	void setUp() throws Exception {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	}

	@AfterEach
	void tearDown() throws Exception {
		piedra = null;
		papel = null;
		tijera = null;
	}

	@Test
	final void testGetInstancePiedra() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Piedra);
	}
	
	@Test
	final void testGetInstancePiedra_false() {
		assertFalse(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Papel);
	}
	
	@Test
	final void testGetInstanceTijera() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.TIJERA) instanceof Tijera);
	}

	@Test
	final void testGetInstancePapel() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PAPEL) instanceof Papel);
	}
	
	@Test
	final void testPiedraPierdeContraPapel() {
		assertEquals(-1, piedra.comparar(papel));
	}
	
	@Test
	final void testGetResultadoPiedraPierdeContraPapel() {
		assertEquals("piedra pierde contra papel", piedra.getDescripcionResultado());
	}
	
	@Test
	final void testPiedraGanaATijera() {
		assertEquals(1, piedra.comparar(tijera));
	}
	
	@Test
	final void testGetResultadoPiedraGanaTijera() {
		piedra.comparar(tijera);
		assertEquals("piedra gana a tijera", piedra.getDescripcionResultado());
	}
	
	@Test
	final void testTijeraPierdeContraPiedra() {
		assertEquals(-1, tijera.comparar(piedra));
	}
	
	@Test
	final void testGetResultadoTijeraPierdeContraPiedra() {
		tijera.comparar(piedra);
		assertEquals("tijera pierde contra piedra", tijera.getDescripcionResultado());
	}
	
	@Test
	final void testTijeraGanaAPapel() {
		assertEquals(1, tijera.comparar(papel));
	}
	
	@Test
	final void testGetResultadoTijeraGanaAPapel() {
		tijera.comparar(papel);
		assertEquals("tijera gana a papel", tijera.getDescripcionResultado());
	}
	
	@Test
	final void testPapelPierdeContraTijera() {
		assertEquals(-1, papel.comparar(tijera));
	}
	
	@Test
	final void testGetResultadoPapelPierdeContraTijera() {
		papel.comparar(tijera);
		assertEquals("papel pierde contra tijera", papel.getDescripcionResultado());
	}
	
//	@Test
//	final void testPapelGanaContraPiedra() {
//		assertEquals(1, papel.comparar(piedra));
//	}
//	
	@Test
	final void testPapelGanaAPiedra() {
		assertEquals(1, papel.comparar(piedra));
	}
	
	@Test
	final void testGetResultadoPapelGanaAPiedra() {
		papel.comparar(piedra);
		assertEquals("papel gana a piedra", papel.getDescripcionResultado());
	}
	
	@Test
	final void testPiedraEmpataPiedra() {
		assertEquals(0, piedra.comparar(piedra));
	}
	
	@Test
	final void testGetResultadoPiedraEmpate() {
		piedra.comparar(piedra);
		assertEquals("piedra empata con piedra", piedra.getDescripcionResultado());
	}
	
	@Test
	final void testTijeraEmpataTijera() {
		assertEquals(0, tijera.comparar(tijera));
	}
	
	@Test
	final void testGetResultadoTijeraEmpate() {
		tijera.comparar(tijera);
		assertEquals("tijera empata con tijera", tijera.getDescripcionResultado());
	}
	
	@Test
	final void testPapelEmpataPapel() {
		assertEquals(0, papel.comparar(papel));
	}
	
	@Test
	final void testGetResultadoPapelEmpate() {
		papel.comparar(papel);
		assertEquals("papel empata con papel", papel.getDescripcionResultado());
	}
}
