package com.techlabs.list.test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.list.model.Student;
import com.techlabs.list.model.StudentComparator;

public class StudentListTest {

	public static void main(String[] args) {

           List<Student> students=new ArrayList<Student>();
           
            students.add(new Student(2,"Vedika",80));
            students.add(new Student(1,"Saurabh",75));
            students.add(new Student(5,"Deep",90));
            students.add(new Student(3,"Yadullah",99));
            students.add(new Student(4,"Subodh",60));
            
            System.out.println("Students Not Sorted");
            printStudents(students);
            System.out.println("Students Sorted Roll Number Wise");
            Collections.sort(students, new StudentComparator.NameComparator());
            printStudents(students);

	}

	private static void printStudents(List<Student> students) {

              for(Student student:students)
            	  System.out.println(student);
		
	}

}
