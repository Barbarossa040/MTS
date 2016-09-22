package testcases;

import static org.junit.Assert.*;
import java.util.Scanner;

import org.junit.Test;

public class PersonTest {
	
		private String personName = "Willem";
		private double personLength = 1.75;
		private double personWeight = 72.00;

		Person personUnderTest = new Person(personName, personLength, personWeight);
		private static final double DELTA = 1E-15;
		
		
		
	@Test
	public void testGetName() {
		
		assertEquals("Willem", personUnderTest.getPersonName());
		personUnderTest.setPersonName("Hansy");	
		assertEquals("Hansy", personUnderTest.getPersonName());
		
	}
	
	@Test
	public void testGetPersonHeight() {
		
		assertEquals(1.75, personUnderTest.getPersonLength(), DELTA);		
		personUnderTest.setPersonLength(1.81);	
		assertEquals( 1.81, personUnderTest.getPersonLength(), DELTA);
		
	}
	
	@Test
	public void testGetPersonWeight(){
		
		assertEquals(72, personUnderTest.getPersonWeight(),DELTA);
		personUnderTest.setPersonWeight(76.00);
		assertEquals(76.00,personUnderTest.getPersonWeight(),DELTA);
		
	}

}
