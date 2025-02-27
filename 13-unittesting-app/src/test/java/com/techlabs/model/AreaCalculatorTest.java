package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
	
	AreaCalculator calculator;
	
	@BeforeEach
	public void init()
	{
		calculator=new AreaCalculator();
	}
	@Test
	public void testCalculateAreaOfCircle()
	{

       assertEquals(78.5, calculator.calculateAreaOfCircle(5));
		
	}
	
	
	@Test
	public void testCalculateAreaOfRectangle()
	{
		
		assertEquals(200,calculator.calculateAreaOfRectangle(10, 20));
	}

}
