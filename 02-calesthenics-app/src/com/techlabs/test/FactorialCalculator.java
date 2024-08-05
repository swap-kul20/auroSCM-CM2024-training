package com.techlabs.test;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
	       
	       System.out.println("Enter a number: ");
	       int number=scanner.nextInt();
	       
	       int factorial=calculateFactorial(number);
	       
	       if(factorial==-1)
	       {
	    	   System.out.println("Can not calculate factorial of negatives");
	    	   return;
	       }
	       
	       System.out.println("Factorial: "+factorial);

	}

	private static int calculateFactorial(int number) {

		if(number==0)
			return 1;
		if(number<0)
			return -1;
		
		int factorial=1;
          for(int i=1;i<=number;i++)
        	  factorial=factorial*i;
          
          return factorial;
	}

}
