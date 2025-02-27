package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

          List<Integer> numbers=Arrays.asList(25,45,35,20,30);          
     
        
          numbers.stream()
                 .forEach((number)->System.out.println(number));
          
          List<Integer> filteredNumbers=numbers.stream()
                 .filter((number)->(number%2!=0))
                 .filter((number)->(number>35))
                 .collect(Collectors.toList());
          
          List<Integer> squreNumbers=numbers.stream()
                  .map((number)->number*number)
                  .collect(Collectors.toList());
          
         int sum= numbers.stream().reduce(0, (number1,number2)->number1+number2);
         System.out.println("Sum: "+sum);
         
         numbers.stream()
                .sorted()
                .limit(3)
                .forEach((number)->System.out.println(number));
         
         Optional<Integer> max=numbers.stream().max((number1,number2)->number1-number2);
         
         if(max.isPresent())
        	 System.out.println("Max is: "+max.get());
         
         List<Account> accounts=Arrays.asList(new Account(5000), new Account(10000));
         
         double sum1=accounts.stream().map((account)->account.getBalance())
                           .reduce(0.0, (balance1,balance2)->balance1+balance2);
         
         
         System.out.println(sum1); 
          
	}

}
