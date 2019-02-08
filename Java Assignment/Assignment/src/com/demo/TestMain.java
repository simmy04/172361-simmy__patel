package com.demo;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account b=new Account("12","simmy");
b.credit(5999);
System.out.println(b.getBalance());

Account b1=new Account("13","bachh",4566);
System.out.println("b1.getbalance");

System.out.println("remaining balance "+b.transfer(b1,5999));
System.out.println("final balance of bachh "+b1.getBalance());
System.out.println(b);

	}

}

	


