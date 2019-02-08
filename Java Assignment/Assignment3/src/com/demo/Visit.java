package com.demo;

import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpence;
	private double productExpence;
	
	
    public Visit(Customer customer,Date date) {	
    	this.customer=customer;
    	this.date=date;
    	
    }
	
	public double getServiceExpence() {
		return serviceExpence;
	}
	public void setServiceExpence(double serviceExpence) {
		this.serviceExpence = serviceExpence;
	}
	public double getProductExpence() {
		return productExpence;
	}
	public void setProductExpence(double productExpence) {
		this.productExpence = productExpence;
	}
	
	public String getName() {
		return customer.getName();
	}
	
	
	public double totalExpense() {
		DiscountRate d1=new DiscountRate();
		double productdiscount, servicediscount=0.0,tot;
		if(this.customer.isMember()) {
			servicediscount=d1.getServiceDiscountRate(customer.getMemberType());
		}
		productdiscount=d1.getProductDiscountRate(customer.getMemberType());
		tot=serviceExpence+productExpence-productdiscount*productExpence-serviceExpence*servicediscount;
		return tot;
		
		
	}

	@Override
	public String toString() {
		return "Vistit [customer=" + customer + ", date=" + date + ", serviceExpence=" + serviceExpence
				+ ", productExpence=" + productExpence + "]";
	}
	
	

}



