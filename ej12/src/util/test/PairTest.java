package util.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import util.Pair;

class PairTest {
	String miString;
	Integer miInteger;

	@BeforeEach
	void setUp() throws Exception {
		miString = new String("Marina");
		miInteger = new Integer(10);
	}

	@AfterEach
	void tearDown() throws Exception {
		miString = null;
		miInteger = null;
	}

	@Test
	void testConstructorConString() {
		Pair<String> strPair = new Pair<String>(miString, "Casas");
		String first = strPair.getFirst();
		String second = strPair.getSecond();
		
		assertEquals("Marina", first);
		assertEquals("Casas", second);
	}
	
	@Test
	void testConstructorConInteger() {
		Pair<Integer> intPair = new Pair<Integer>(miInteger, 15);
		Integer first = intPair.getFirst();
		Integer second = intPair.getSecond();
		
		assertEquals(10, first);
		assertEquals(15, second);
	}

}
