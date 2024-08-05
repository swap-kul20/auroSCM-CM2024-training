package com.techlabs.test;

import com.techlabs.model.IAddition;

public class IAdderTest {
public static void main(String[] args) {
	
	IAddition adder = (number1,number2)-> number1+number2;
	
	System.out.println(adder.add(5, 7));
}
}
