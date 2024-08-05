package com.techlabs.model;

public class Student {
	
	private IStudentService studentService;
	
	
	
	public Student(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}



	double calaculatePercentage()
	{
		return studentService.getTotalMarks()/studentService.getTotalNumberOfSubjects();
	}

}
