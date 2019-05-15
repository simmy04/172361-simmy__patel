package com.seller.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seller.demo.pojo.Seller;
import com.seller.demo.repo.Repository;
import com.seller.demo.service.SellerService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Controller {

	
	@Autowired
	SellerService service;
	
	@PostMapping("/selleradd")
	public Seller addSellerInfo(@RequestBody Seller seller) {
		System.out.println("In seller");
		System.out.println(seller);
		Seller sinfo=service.postSellerInfo(seller);
		 return sinfo;
		}
	
	@GetMapping("/getsellers")
	public List<Seller> getAllSellers() {
		System.out.println("Get all Sellers...");

		List<Seller> s= service.getAllSellers();
		System.out.println("After list");
		System.out.println(s);
		return s;
	}

	@DeleteMapping("/deletebuyer/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") String oid) {
		System.out.println("Delete Customer with ID = " + oid + "...");
		

		service.deleteCustomer(oid);

		
		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}
}
