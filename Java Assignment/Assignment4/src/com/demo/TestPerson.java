package com.demo;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	      Student s1 = new Student("sim a1", "1 Happy Ave");
	      s1.addCourseGrade("IM101", 97);
	      s1.addCourseGrade("IM102", 68);
	      s1.printGrades();
	      System.out.println("Average is " + s1.getAverageGrade());
	      
	     
	      Teacher t1 = new Teacher("Sri sim", "8 sunset way");
	      System.out.println(t1);
	      String[] courses = {"01", "102", "101"};
	      for (String course: courses) {
	         if (t1.addCourse(course)) {
	            System.out.println(course + " added.");
	         } else {
	            System.out.println(course + " cannot be added.");
	         }
	      }
	      for (String course: courses) {
	         if (t1.removeCourse(course)) {
	            System.out.println(course + " removed.");
	         } else {
	            System.out.println(course + " cannot be removed.");
	         }
	      }
	   }
	}

	


