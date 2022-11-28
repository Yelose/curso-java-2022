package employee.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modules.Employee;

class EmployeeTest extends Employee {

	Employee marina;
	Employee viviana;
	
	@BeforeEach
	void setUp() throws Exception {
		Date fechaIngresoMarina = new Date(2022, 11, 18);
		marina = new Employee(fechaIngresoMarina, 16000.00, "Marina", 37);
		viviana = new Employee();
	}

	@AfterEach
	void tearDown() throws Exception {
		marina = null;
		viviana = null;
	}

	
	@Test
	final void testMarinaEquals_true() {
		Date fecha = new Date(2022, 11, 18);
		Employee marinaTest = new Employee(fecha, 16000.00, "Marina", 37);
		assertTrue(marina.equals(marinaTest));
	}
	
	@Test
	final void testMarinaEquals_false() {
		Date fecha = new Date(2024, 11, 18);
		Employee marinaTest = new Employee(fecha, 16000.00, "Marina", 37);
		assertFalse(marina.equals(marinaTest));
	}

}
