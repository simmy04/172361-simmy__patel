package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.pojo.Seller;
import com.example.demo.repo.SellerRepo;
@Service
public class SellerService {
	@Autowired
	  SellerRepo res;
	public Seller addSeller(@RequestBody Seller seller) {
		System.out.println("In seller add method");
		System.out.println(seller);
		 return res.save(seller);
		 
		 
}
	public Seller validateSeller(Seller userlog) {
		System.out.println(userlog);
		System.out.println("In controller");
		System.out.println(userlog);
			List<Seller> login=res.findAll();
			System.out.println(login);
			System.out.println();
			
			
			System.out.println("After repository");
			System.out.println(login);
			for(Seller dblog:login) {
				System.out.println(dblog);
				if(dblog.getUname().equals(userlog.getUname())&&dblog.getPass().equals(userlog.getPass())) {
					return dblog;
			}	
		
		}
			return null;
	}
	public List<Seller> getAllSellers() {
		
      System.out.println("In service get seller");
		List<Seller> sellers = new ArrayList<>();
		res.findAll().forEach(sellers::add);

		
		return sellers;
		
	}
}
