package com.demo;

import java.util.ArrayList;

public class TestFriend {

    private ArrayList<Friend> phone;

    public TestFriend() {
        this.phone = new ArrayList<>();
    }

    public void addnew(String name, String number) {
    	Friend newperson = new Friend (name, number);
        this.phone.add(newperson);      
    }
    public String FindNumber(String UserName){
    	   for(Friend f : this.phone ) {
    	      if (UserName.equals( f.getName())){
    	         return f.getNumber();
    	      }
    	   }
    	   return "Not available";
    	}
    
    public boolean modifynumber(String userName,String phonenumber) {
    	for(Friend f:this.phone) {
    		if(userName.equals(f.getName())) {
    		 f.setNumber(phonenumber);
    		 return true;
    		}
    	}
    	return false;
    }
    
    
}


