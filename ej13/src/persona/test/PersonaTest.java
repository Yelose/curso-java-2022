package persona.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import util.Persona;
import util.PersonaUtil;

class PersonaTest extends Persona {
	
	private Persona marta;
	private Persona marina;
	private Persona p1;
	private Persona p2;
	private Persona p3;
	private Persona p4;
	private Persona p5;
	
	List<Persona> personList;
	
	@BeforeEach
	void setUp() throws Exception {
		marta = new Persona(12345, "Marta", 30);
		marina = new Persona(12346, "Marina", 37);
		
		p1 = new Persona(12345, "Marta", 30);
		p2 = new Persona(12346, "Marina", 37);
		
		p3 = new Persona(12349, "Paz", 17);
		p4 = new Persona(12350, "Nerea", 36);
		p5 = new Persona(12351, "Cristina", 21);
		
		personList = new ArrayList<Persona>();
		personList.add(marta);
		personList.add(marina);
		

	}

	@AfterEach
	void tearDown() throws Exception {
		marta = null;
		marina = null;
		personList = null;
		p1 = null;
		p2 = null;
		p3 = null;
		p4 = null;
		p5 = null;
	}

	@Test
	final void testNewMapNotEmptytest() {
		List<Persona> personaList = new ArrayList<Persona>();
		personaList.add(marina);
		assertFalse(personaList.isEmpty());
	}

	@Test
	final void testNewPersonGetNametest() {
		assertEquals(marta.getName(), "Marta");
	}
	
	@Test
	final void testNewPersonGetAgetest() {
		assertEquals(marta.getAge(), 30);
	}
	
	@Test
	final void testNewPersonGetExp() {
		assertEquals(marta.getExp(), 12345);
	}
	@Test
	final void testNewPersonGetName2() {
		assertEquals(marina.getName(), "Marina");
	}
	
	@Test
	final void testNewPersonGetAge2() {
		assertEquals(marina.getAge(), 37);
	}

	@Test
	final void testNewPersonGetExp2test() {
		assertEquals(marina.getExp(), 12346);
	}
	
	@Test
	final void testNewPersonasContainsMartaMap() {
		List<Persona> personaList = new ArrayList<Persona>();
		personaList.add(marina);
		personaList.add(marta);
		assertTrue(personaList.contains(marta));
	}
	
	@Test
	final void TestNewPersonasContainsMarinaMap() {
		List<Persona> personaList = new ArrayList<Persona>();
		personaList.add(marina);
		personaList.add(marta);
		assertTrue(personaList.contains(marina));
	}
	
	@Test
	final void testNewPersonasMapCompareToPersonasList_true() {
		Map<Integer, Persona> MapPersons = new HashMap<Integer, Persona>();
		
		MapPersons.put(p1.getExp(), p1);
		MapPersons.put(p2.getExp(), p2);
		
		List<Persona> personList = new ArrayList<Persona>();
	    personList.add(marta);
	    personList.add(marina);
	        
		Map<Integer, Persona> personas = PersonaUtil.getPersonas(personList);
	    assertTrue(MapPersons.equals(personas));
	}

	@Test
	final void testNewPersonasMapCompareToPersonasList_false() {
		Map<Integer, Persona> MapPersons = new HashMap<Integer, Persona>();
		p1.setAge(15);
		MapPersons.put(p1.getExp(), p1);
		MapPersons.put(p2.getExp(), p2);
		
		List<Persona> personList = new ArrayList<Persona>();
	    personList.add(marta);
	    personList.add(marina);
	        
		Map<Integer, Persona> personas = PersonaUtil.getPersonas(personList);
	    assertFalse(MapPersons.equals(personas));
	}

//	@Test
//	final void getPersonastest() {
//		Map<Integer, Persona> mapPersons = new HashMap<Integer,Persona>();		
//		mapPersons.put(p1.getExp(), p1);
//		mapPersons.put(p1.getExp(), p1);
//		mapPersons.put(p1.getExp(), p1);
//		mapPersons.put(p1.getExp(), p1);
//		mapPersons.put(p1.getExp(), p1);
//		
//		assertEquals(mapPersons, PersonaUtil.getPersonas(personList));
//	}
}
