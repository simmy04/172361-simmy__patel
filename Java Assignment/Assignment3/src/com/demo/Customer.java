package com.demo;
public class Customer{
private String name;
private boolean member;
private String memberType;


public String getMemberType() {
	return memberType;
}
public void setMemberType(String memberType) {
	this.memberType = memberType;
}
public String getName() {
	return name;
}


public Customer(String name) {
	this.name=name;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
}
public void setMember(boolean member) {
	this.member = member;
}

public boolean isMember() {
	if(member==true)
		return true;
	else
		return false;
}



}
	 
	 
	 


