package com.demo1;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author b1=new Author("tan b1","simmy@gmail.com",'m');
		System.out.println(b1);
		Book dummybook=new Book("java for dummies",b1,9,7);
		System.out.println(dummybook);
		dummybook.setPrice(8.88);
		dummybook.setQty(88);
		System.out.println(dummybook);
		System.out.println("name is:"+dummybook.getName());
		System.out.println("price is"+dummybook.getPrice());
		System.out.println("Qty is"+dummybook.getQty());
		System.out.println("author is:"+dummybook.getAuthor());
		System.out.println("authors name is:"+dummybook.getAuthor().getName());
		System.out.println("authors email is:"+dummybook.getAuthor().getEmail());
		System.out.println("authors gender is:"+dummybook.getAuthor().getGender());
		Book moredummyBook=new Book("java for more dummies",new Author("peter lee","peter@gmail.com",'m'),19,8);
		System.out.println(moredummyBook);
		
		

	}

	

	

	
	}

	
	

	
	


