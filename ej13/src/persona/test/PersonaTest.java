package persona.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import util.Persona;

class PersonaTest extends Persona {
	
	private Persona marta;
	private Persona marina;
	
	@BeforeEach
	void setUp() throws Exception {
		marta = new Persona(12345, "Marta", 30);
		marina = new Persona(12346, "Marina", 37);
	}

	@AfterEach
	void tearDown() throws Exception {
		marta = null;
		marina = null;
	}

	@Test
	final void newPersonGetNametest() {
		assertEquals(marta.getName(), "Marta");
	}
	
	@Test
	final void newPersonGetAgetest() {
		assertEquals(marta.getAge(), 30);
	}

	@Test
	final void newPersonGetExptest() {
		assertEquals(marta.getExp(), 12345);
	}
	@Test
	final void newPersonGetName2test() {
		assertEquals(marina.getName(), "Marina");
	}
	
	@Test
	final void newPersonGetAge2test() {
		assertEquals(marina.getAge(), 37);
	}

	@Test
	final void newPersonGetExp2test() {
		assertEquals(marina.getExp(), 12346);
	}
	
	@Test
	final void newPersonasContainsMartaMaptest() {
		List<Persona> personaList = new ArrayList<Persona>();
		personaList.add(marina);
		personaList.add(marta);
		assertTrue(personaList.contains(marta));
	}
	
	@Test
	final void newPersonasContainsMarinaMaptest() {
		List<Persona> personaList = new ArrayList<Persona>();
		personaList.add(marina);
		personaList.add(marta);
		assertTrue(personaList.contains(marina));
	}
	
}
