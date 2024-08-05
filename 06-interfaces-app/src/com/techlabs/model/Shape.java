package com.techlabs.model;

public interface Shape {
	
	void area();
	public default void volume()
	{
		System.out.println("Inside Shape");
	}
	
	static void perimeter()
	{
		System.out.println("dbbskb");
	}

}
