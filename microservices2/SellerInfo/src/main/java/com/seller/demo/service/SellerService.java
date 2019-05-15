package com.seller.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.seller.demo.pojo.Seller;
import com.seller.demo.repo.Repository;
@Service
public class SellerService {

	@Autowired
	Repository  res;
	
	public List<Seller> getAllSellers() {
		
        System.out.println("In service get seller");
		List<Seller> sellers = new ArrayList<>();
		res.findAll().forEach(sellers::add);

		
		return sellers;
		
	}
	
	public Seller postSellerInfo(Seller seller) {
        System.out.println("In seller now");
       
        System.out.println("cid is"+seller.getOid());
		Seller _seller = res.save(new Seller(seller.getOid(),seller.getTitle(),seller.getDesc(),seller.getSname()));
		return _seller;
	}
	public ResponseEntity<String> deleteCustomer(String oid) {
		System.out.println("Delete Customer with ID = " + oid + "...");

		res.deleteById(oid);

		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}
}
