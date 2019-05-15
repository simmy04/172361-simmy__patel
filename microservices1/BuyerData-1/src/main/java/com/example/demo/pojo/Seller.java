package com.example.demo.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sellerlogin")
public class Seller {

	private String name;
	private String email;
	private String uname;
	private String pass;
	
	public Seller() {
		}

	public Seller(String name, String email, String uname, String pass) {
		super();
		this.name = name;
		this.email = email;
		this.uname = uname;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Seller [uname=" + uname + ", pass=" + pass + "]";
	}
	
	

}
