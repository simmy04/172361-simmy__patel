package com.javasampleapproach.springrest.mongodb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mongodb.model.BuyerData;
import com.javasampleapproach.springrest.mongodb.model.Customer;
import com.javasampleapproach.springrest.mongodb.model.Seller;
import com.javasampleapproach.springrest.mongodb.model.SellerSignup;
import com.javasampleapproach.springrest.mongodb.repo.CustomerRepository;
import com.javasampleapproach.springrest.mongodb.repo.SellerRepository;
import com.javasampleapproach.springrest.mongodb.repo.SellerSign;
import com.javasampleapproach.springrest.mongodb.service.Service;

//http://localhost:3333/api/findbyage/seller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {
	Customer ccustomer;
	SellerSignup cseller;
	@Autowired
	Service service;
	@GetMapping("/findbyage/customers")
	public List<Customer> getAllCustomers() {
		System.out.println("Get all Customers...");
		return service.getAllCustomers();
	}
	@GetMapping("/findbyage/info")
	public List<BuyerData> getData() {
		System.out.println("Get all Customers...");
		return service.getBuyerInfo();
	}
	@GetMapping("/findbyage/seller")
	public List<Seller> getAllSellers() {
		System.out.println("Get all Sellers...");

		List<Seller> s=service.getAllSellers();
		System.out.println("After list");
		System.out.println(s);
		return s;
	}
	@PostMapping("/findbyage/sellerinfo")
	public Seller postSellerInfo(@RequestBody Seller customer) {
          System.out.println("In seller now");
      
		return service.postSellerInfo(customer);
	}
	@PostMapping("/raja")
	public BuyerData postBuyerInfo(@RequestBody BuyerData customer) {
          System.out.println("**********");
      
		return service.postBuyerInfo(customer);
	}

	@PostMapping("/findbyage/create")
	public Customer postCustomer(@RequestBody Customer customer) {
          System.out.println("In seller now");
       
          	return service.postCustomer(customer);
	}

	@PostMapping("/findbyage/sellersign")
	public SellerSignup postSeller(@RequestBody SellerSignup seller) {
          System.out.println("In seller info now");
       
		return service.postSeller(seller);
	}

	@DeleteMapping("/findbyage/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") String oid) {
		System.out.println("Delete Customer with ID = " + oid + "...");
         service.deleteCustomer(oid);
		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}

	@DeleteMapping("/findbyage/delete")
	public ResponseEntity<String> deleteAllCustomers() {
		System.out.println("Delete All Customers...");
		service.deleteAllCustomers();
		
		return new ResponseEntity<>("All customers have been deleted!", HttpStatus.OK);
	}

	
	
	@PostMapping("/findbyage/valid")
public Customer validateUser(@RequestBody Customer userlog) {
		 ccustomer=service.validateUser(userlog);
	return ccustomer;


}
	
	@PostMapping("/findbyage/validateseller")
	public SellerSignup validateSeller(@RequestBody Customer userlog) {
		cseller=service.validateSeller(userlog);
		return cseller;

}
}
