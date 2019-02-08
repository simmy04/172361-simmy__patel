package com.demo;

public class Account {
	private String id;
	private String name;
	private int balance;
	public Account(String id,String name) {
		this.id=id;
		this.name=name;
	
	}
	public Account(String id,String name,int balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	public int credit(int amount) {
		balance=balance+amount;
		return balance;
	}
	public int debit(int amount) {
		if(amount>balance)
			System.out.println("amount exceeded balance");
		else {
			balance=balance-amount;
		}
		return balance;
	}
public int transfer(Account another,int amount) {
	if(amount<=balance) {
		another.credit(amount);
	balance=balance-amount;
		
	}
else {
	System.out.println("amount exceeded the balance");
}
return balance;
}
}

