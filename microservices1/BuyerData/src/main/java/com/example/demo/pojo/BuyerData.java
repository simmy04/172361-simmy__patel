package com.example.demo.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="rating")
public class BuyerData {
	@Id
private String sname;
private String bname;
private String title;
private String rating;
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public BuyerData(String sname, String bname, String title, String rating) {
	super();
	this.sname = sname;
	this.bname = bname;
	this.title = title;
	this.rating = rating;
}
public BuyerData() {
	super();
	// TODO Auto-generated constructor stub
}

}
