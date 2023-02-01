package com.sriteja.main;

import com.sriteja.bean.CollegeDetails;

public class CollegeDetailsMain {
	
	//main method
	public static void main(String args[]){
		
		//college Details object creation
		CollegeDetails collegeDetails = new CollegeDetails();
		collegeDetails.setCollegeName("Narayana");
		collegeDetails.setCollegeStudentStrength(500);
	    collegeDetails.setCollegeStartDate("26-07-2000");
	    collegeDetails.setCollegeAddress("Vijayawada,Krishna dist.");
	    collegeDetails.setCollegeCategiry("Intermediate");
	    collegeDetails.setCollegeMobileNum("+919855440391");
	    collegeDetails.setCollegeGrade('A');
	    collegeDetails.setCollegeCode(10808);
	    collegeDetails.setCollegeEmailId("shireeshagowd@123");
	    collegeDetails.setCollgegeStaffStrength(500);
	    
	    System.out.println("Narayana college Details::"+collegeDetails);
	}
	    
		
	
	

	}
	


