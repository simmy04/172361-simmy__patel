package com.demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestFriend t1=new TestFriend();
		t1.addnew("simmy", "9876543210");
		t1.addnew("rimmy","9988776655");
		
		t1.modifynumber("simmy", "987665444566");
		
		System.out.println(t1.FindNumber("simmy"));
		
		System.out.println(t1.FindNumber("kkkkk"));
		
		
	}
	

	}


