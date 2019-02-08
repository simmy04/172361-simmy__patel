package com.demo;
import java.util.Date;

public class TestMain {

	public static void main(String[] args) {
		Customer c1=new Customer("simmy");
		c1.setMember(true);
		c1.setMemberType("Gold");
		
		Visit v=new Visit(c1,new Date());
		v.setProductExpence(3000);
		v.setServiceExpence(3000);
		
		System.out.println(v.totalExpense());
		
		
		
		

	}

}

		

	


