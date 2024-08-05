package com.techlabs.test;



public class Test {

	public static void main(String[] args)  {
		
	

		try {

			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);

			double result = number1 / number2;

			System.out.println("Division is: " + result);
			
		}

		catch (ArithmeticException exception) {
			System.out.println("Wrong input for number2. It can not be zero");
		}
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("Please provide two numbers. Number can not be empty");
		}
		catch(NumberFormatException exception)
		{
			System.out.println("Only integer values are allowed.");
		}
		catch(Exception exception)
		{
			System.out.println("Something went wrong:"+exception);
		}
		finally
		{
			System.out.println("Inside finally. Closing activities");
		}
		System.out.println("Exiting main");

	}

}
