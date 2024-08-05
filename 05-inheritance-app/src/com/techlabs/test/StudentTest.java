package com.techlabs.test;

import com.techlabs.model.Person;
import com.techlabs.model.Student;

public class StudentTest {

	public static void main(String[] args) {

         Student student1=new Student("Saurabh","kalyan",22,1,80.5);
    
         
         System.out.println(student1);
         
         Person person;
         person=new Student("Saurabh","kalyan",22,1,80.5);
         
         person.display();

	}

}
