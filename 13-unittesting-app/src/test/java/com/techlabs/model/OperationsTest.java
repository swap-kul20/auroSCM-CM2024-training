package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	
	Operations operation;
	
	@BeforeEach
	void init()
	{
	    operation=new Operations();
	}
	
	@AfterEach
	void status()
	{
		System.out.println("Test finished");
	}

	@Test
	public void testAddition() {	
		
		
		assertEquals(25, operation.addition(10, 20),"This method must perform addition");
	}
	
	@Test
	public void testSubstraction() {
		
	
		
		assertEquals(30, operation.addition(10, 20));
	}
	
	@Test
	public void testDivision() {
		
	
		
		assertEquals(2.0, operation.division(20, 10));
		
		assertThrows(ArithmeticException.class,()-> operation.division(10, 0));
		
	}
	
	@Test
	public void testMuliplication() {
		
	
		
		assertEquals(30, operation.addition(10, 20));
	}
	
	@Test
	public void testsquareOfArrayElements()
	{
		int squares[]= {25,36,49};
		int numbers[]= {5,6,7};
		assertArrayEquals(squares, operation.squareOfArrayElements(numbers));
	}
	
	@Test
	public void testIsEven()
	{
		//assertEquals(true, operation.isEven(6));
		
		assertTrue(operation.isEven(6));
		assertFalse(operation.isEven(7));
		
		
	}

}
