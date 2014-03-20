package tests;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import company.Employee;
import company.FullTimeContract;


public class EmployeeTest {
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	
	@Before
	public void outputTest(){
		System.setOut(new PrintStream(out));
		out.toString();
	}
	
	@Test
	public void testCreationOfEmployee() {
		FullTimeContract c = new FullTimeContract(7);
		Employee e = new Employee("Jay",123,"Computing", c);
		assertEquals(e.getName(), "Jay");
		assertEquals(e.getDepartment(),"Computing");
		e.display();
		assertEquals("Department: " + e.getDepartment(), out.toString().trim());
	
	}

}
