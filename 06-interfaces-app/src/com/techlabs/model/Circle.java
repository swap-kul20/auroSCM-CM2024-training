package com.techlabs.model;

public class Circle implements Shape, Shape2 {
	
	private int radius;
	
	

	public Circle(int radius) {
		super();
		this.radius = radius;
	}



	@Override
	public void area() {

         System.out.println("Area of circle: "+(3.14*radius*radius));
		
	}
	
    public void volume()
	{
		System.out.println("Inside Shape");
	}
    
    public void perimeter()
    {
    	System.out.println("utututututu");
    	
    }
	

}
