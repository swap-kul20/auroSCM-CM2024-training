package com.techlabs.test;

import java.util.Scanner;

public class MatrixTest {

	public static void main(String[] args) {

       Scanner scanner=new Scanner(System.in);
       int matrix[][]=new int[3][3];
       
       System.out.println("Enter elements of matrix: ");
       
       createRows(matrix,scanner);
       
       System.out.println("Matrix is: ");
      
       printMatrix(matrix);
	}
	
	private static void printMatrix(int matrix[][])
	{
		 for(int row=0;row<3;row++)
	       {
	    	   printRow(matrix,row);
	    	   System.out.println("");
	       }

		
	}
	
	private static void printRow(int[][] matrix, int row) {
		
		for(int col=0;col<3;col++)
 	   {
 		  System.out.print(matrix[row][col]+"\t");
 	   }
		
	}

	private static void createRows(int matrix[][],Scanner scanner)
	{
		for(int row=0;row<3;row++)
	       {
	    	  readRowElements(matrix, scanner, row);
	       }
	       
	}
	
	private static void readRowElements(int matrix[][],Scanner scanner, int row)
	{
		 for(int col=0;col<3;col++)
  	   {
  		   matrix[row][col]=scanner.nextInt();
  	   }
	}

}
