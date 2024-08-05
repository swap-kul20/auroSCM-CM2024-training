package com.techlabs.exceptions;

public class AgeNotValidException extends RuntimeException{
	
	private int age;
	
	
	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}


	public String getMessage()
	{
		return "Age Not Valid: Age must be less than 18. You have entered: "+age;
	}

}
