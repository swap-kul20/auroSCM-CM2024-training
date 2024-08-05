package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {
	
	private IStudentService studentService;
	private Student student;
	
	
	void init()
	{
		studentService=Mockito.mock(IStudentService.class);
		student=new Student(studentService);

		
	}

	@Test
	void testCalaculatePercentage() {
		
		Mockito.when(studentService.getTotalMarks()).thenReturn(650);
		Mockito.when(studentService.getTotalNumberOfSubjects()).thenReturn(10);
		
		assertEquals(65, student.calaculatePercentage());
	}

}
