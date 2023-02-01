package com.sriteja.main;

import com.sriteja.bean.StudentDetails;

public class StudentDetailsMain {
	//main method
	public static void main(String args[]) {
		
		//student details object creation
		
		StudentDetails student = new StudentDetails();
		student.setStudentName("Shireesha");
		student.setStudentRollNum(18547);
		student.setStudentAddress("Anantapur");
		student.setStudentGroup("Bsc");
		student.setStudentEmailId("shireesha@123");
		student.setStudentGrade('A');
		
		System.out.println("Shireesha Details::"+student);
		
		
	}

}
