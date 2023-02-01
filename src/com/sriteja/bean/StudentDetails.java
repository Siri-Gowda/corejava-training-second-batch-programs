package com.sriteja.bean;

public class StudentDetails {
	//attributers
	private String StudentName;
	private int StudentRollNum;
	private String StudentAddress;
	private String StudentEmailId;
	private String StudentGroup;
	private char StudentGrade;
	
	//default constructor
	public StudentDetails() {
		
		//setter and getter methods
		
	}

	@Override
	public String toString() {
		return "StudentDetails [StudentName=" + StudentName + ", StudentRollNum=" + StudentRollNum + ", StudentAddress="
				+ StudentAddress + ", StudentEmailId=" + StudentEmailId + ", StudentGroup=" + StudentGroup
				+ ", StudentGrade=" + StudentGrade + "]";
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getStudentRollNum() {
		return StudentRollNum;
	}

	public void setStudentRollNum(int studentRollNum) {
		StudentRollNum = studentRollNum;
	}

	public String getStudentAddress() {
		return StudentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}

	public String getStudentEmailId() {
		return StudentEmailId;
	}

	public void setStudentEmailId(String studentEmailId) {
		StudentEmailId = studentEmailId;
	}

	public String getStudentGroup() {
		return StudentGroup;
	}

	public void setStudentGroup(String studentGroup) {
		StudentGroup = studentGroup;
	}

	public char getStudentGrade() {
		return StudentGrade;
	}

	public void setStudentGrade(char studentGrade) {
		StudentGrade = studentGrade;
	}
	
	
	

}
