package com.techlabs.model;

public class Reference {
	
	public Reference()
	{
		System.out.println("Inside constructor");
	}
	
	public static void staticPrint()
	{
		System.out.println("Inside static");
	}
	
	public void print()
	{
		System.out.println("Inside non static");
	}

	@Override
	public String toString() {
		return "Reference []";
	}
	
	

}
