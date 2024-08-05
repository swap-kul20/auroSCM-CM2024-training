package com.techlabs.test;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTest {
public static void main(String[] args) {
	
	Predicate<Integer> evenChecker = (Integer number) -> (number%2==0);
	System.out.println(evenChecker.test(50));
	
	
} 
}
