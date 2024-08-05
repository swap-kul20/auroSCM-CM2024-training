package com.techlabs.model;

public class Box {
	
	private int width;
	private int length;
	private int depth;
	
	
	
	public Box() {
		
		this.width = 10;
		this.length = 10;
		this.depth = 10;
		
	}
	
	@Override
	public String toString() {
		return "Box [width=" + width + ", length=" + length + ", depth=" + depth + "]";
	}

	public Box(int width, int length)
	{
		this();
		this.width = width;
		this.length = length;
		
	}



	public Box(int width, int length, int depth) {
	
		this(width,length);
		this.width = width;
		this.length = length;
		this.depth = depth;
		
	}
	

}
