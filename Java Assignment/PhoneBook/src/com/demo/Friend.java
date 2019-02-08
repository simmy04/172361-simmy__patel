package com.demo;

public class Friend {

    private String name;
    private String number;

    public Friend(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }    

    public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
        return this.number;
    }


    public String toString() {
        return "" + getName()+ "  number: " + getNumber();
    }    
}


