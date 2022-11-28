package util.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import util.SetOperations;

class SetOperationsTest extends SetOperations {

	Set<String> groupA;
	Set<String> groupB;
	Set<Integer> groupC;
	Set<Integer> groupD;

	
	
	@BeforeEach
	void setUp() throws Exception {
		groupA.add("A");
		groupA.add("B");
		groupA.add("C");
		groupA.add("D");		
		groupA.add("D");

		groupB.add("C");
		groupB.add("D");
		groupB.add("E");
		groupB.add("F");
		
		groupC.add(1);
		groupC.add(-2);
		groupC.add(3);
		groupC.add(-3);
		
		groupD.add(3);
		groupD.add(4);
		groupD.add(5);
		groupD.add(6); 
	}

	@AfterEach
	void tearDown() throws Exception {
		groupA = null;
		groupB = null;
		groupC = null;
		groupD = null;
	}

	@Test
	final void convertStringToSetAtest() {
		
		assertEquals(4, groupA.size());
	}

	

	
}
