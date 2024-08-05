package com.techlabs.model;

public class Box {
	
	private int width;
	private int depth;
	private int height;
	
	public Box()
	{
		width=0;
		height=0;
		depth=0;
	}
	
	public Box(int width, int depth, int height)
	{
		this.width=width;
		this.depth=depth;
		this.height=height;
	}
	
	public int getDepth()
	{
		return depth;
	}
	
	public void setDepth(int depth)
	{
		this.depth=depth;
	}
	public int getWidth()
	{
		return width;
	}
	
	public void setWidth(int width)
	{
		this.width=width;
	}
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int height)
	{
		this.height=height;
	}

}
