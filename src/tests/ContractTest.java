package tests;
import static org.junit.Assert.*;

import company.FullTimeContract;
import company.PartTimeContract;
import org.junit.Before;
import org.junit.Test;

public class ContractTest {

	PartTimeContract partTime;
	FullTimeContract fullTime;
	
	@Before
	public void before() {
		fullTime = new FullTimeContract(10); // payrate
		partTime = new PartTimeContract(9, 30); // payrate, hours
	}
	
	@Test
	public void testPartTimeContractCreation() {
		assertEquals(partTime.getHours(), 30);
		assertEquals(partTime.getPayRate(), 9);
	}
	
	@Test
	public void testFullTimeContractCreation() {
		assertEquals(fullTime.getPayRate(), 10);
	}

	@Test
	public void testGetWeeklyWageFullTime() {
		assertEquals(fullTime.getWeeklyWage(), fullTime.getHours()*fullTime.getPayRate());
	}
	
	@Test
	public void testGetWeeklyWagePartTime() {
		assertEquals(partTime.getWeeklyWage(), partTime.getHours()*partTime.getPayRate());
	}
}
