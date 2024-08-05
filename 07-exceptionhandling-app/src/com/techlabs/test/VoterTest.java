package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exceptions.AgeNotValidException;
import com.techlabs.model.Voter;

public class VoterTest {

	public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter voter id: ");
        int voterId=scanner.nextInt();
        System.out.println("Enter First name: ");
        String firstName=scanner.next();
        System.out.println("Enter Last name: ");
        String lastName=scanner.next();
        System.out.println("Enter Age: ");
        int age=scanner.nextInt();
        Voter voter=null;
        try
        {
        voter=new Voter(voterId,firstName,lastName,age);
       
        }
        catch(AgeNotValidException exception)
        {
        	System.out.println(exception.getMessage());
        }
        System.out.println(voter);

	}

}
