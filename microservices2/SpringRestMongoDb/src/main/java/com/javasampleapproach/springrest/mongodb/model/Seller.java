package com.javasampleapproach.springrest.mongodb.model;

import java.util.Random;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="sellerinfo")
public class Seller {
	@Transient
	private int pid=100000 + new Random().nextInt(900000);
	
	
@Id
private String oid=Integer.toString(pid);
private String title;
private String desc;
private String sname;
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getOid() {
	return oid;
}
public void setOid(String oid) {
	
	this.oid=oid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}

public Seller() {
	super();
}
public Seller(String oid,String title, String desc,String sname) {
	super();
	this.oid=oid;
	this.title = title;
	this.desc = desc;
	this.sname=sname;
}
@Override
public String toString() {
	return "Seller [oid=" + oid + ", title=" + title + ", desc=" + desc + ", sname=" + sname + "]";
}

}
