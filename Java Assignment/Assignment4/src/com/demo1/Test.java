package com.demo1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cone = new Customer(1,"hello customer",'m');
		Account a3 = new Account(33,cone,99999);
		System.out.println("Details are------");
		System.out.println(a3);
		a3.deposit(787878.67);
		a3.withdraw(565665.87);
	}


}

	


