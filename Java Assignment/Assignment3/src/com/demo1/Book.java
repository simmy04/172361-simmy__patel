package com.demo1;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int Qty;
	public Book(String name, Author author,double price,int Qty) {
		
		this.name = name;
		this.author = author;
		this.price = price;
		this.Qty = Qty;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int Qty) {
		this.Qty = Qty;
	}
	

}
