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

	String[] miString;
	Integer[] miInteger;
	
	Set<String> groupA;
	Set<String> groupB;
	Set<Integer> groupC;
	Set<Integer> groupD;
	
	
	@BeforeEach
	void setUp() throws Exception {
		String[] a = { "A", "B", "C", "C", "D" };		 
		String[] b = { "C", "D", "E", "F" };
		Integer[] c = {1, 2, 3, 4};
		Integer[] d = {3, 4, 5, 6, 7};		 
		
	    List<String> strAunionB;
		
		convertToSet(a);
		convertToSet(b);
		convertToSet(c);
		convertToSet(d);
		
		convertToSet(strAunionB);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void convertStringToSetAtest() {
		String[] a = { "A", "B", "C", "C", "D" };
		groupA = convertToSet(a);
		assertEquals(4, groupA.size());
	}
	
	@Test
	final void convertStringToSetBtest() {
		String[] b = { "C", "D", "E", "F" };
		groupB = convertToSet(b);
		assertEquals(4, groupB.size());
	}
	
	@Test
	final void convertIntegerToSetCtest() {
		Integer[] c = {1, -2, 3, 4, 4, 4, 4};
		groupC = convertToSet(c);
		assertEquals(4, groupC.size());
	}
	
	@Test
	final void convertIntegerToSetDtest() {
		Integer[] d = {1, -2, 3};
		groupD = convertToSet(d);
		assertEquals(3, groupD.size());
	}
	
	@Test
	final void stringAunionBtest() {
		String[] listA = {"A", "B", "C", "C", "D"};
	    List<String> a = Arrays.asList(listA);
	    String[] listB = { "C", "D", "E", "F" };
	    List<String> b = Arrays.asList(listB);
	    List<String> together = union(a,b);
		assertEquals(9, together.size());
	}
	
	@Test
	final void stringAunionBconvertToSettest() {
		String[] listA = {"A", "B", "C", "C", "D"};
	    List<String> a = Arrays.asList(listA);
	    String[] listB = { "C", "D", "E", "F" };
	    List<String> b = Arrays.asList(listB);
	    List<String> result = union(a,b);
	    Set unionAB = convertToSet(result);
	}
	
}
