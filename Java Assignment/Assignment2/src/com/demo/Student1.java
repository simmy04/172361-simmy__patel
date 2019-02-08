package com.demo;

public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student a = new Student("Tan a", "1 Happy Average");
	      System.out.println(a);  // toString()

	    
	      a.setAddress("8 Kg Java");
	      System.out.println(a);  
	      System.out.println(a.getName());
	      System.out.println(a.getAddress());

	   
	      a.addCourseGrade("IM101", 89);
	      a.addCourseGrade("IM102", 57);
	      a.addCourseGrade("IM103", 96);
	      a.printGrades();
	      System.out.printf("The average grade is %.2f%n", a.getAverageGrade());
	   }
	}
	


