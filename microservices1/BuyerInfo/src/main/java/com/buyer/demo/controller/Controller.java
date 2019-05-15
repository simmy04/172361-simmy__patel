package com.buyer.demo.controller;


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

import com.buyer.demo.pojo.Buyer;
import com.buyer.demo.repo.BuyerRepository;
import com.buyer.demo.service.BuyerService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Controller {

	@Autowired
	BuyerService service;
	
	@PostMapping("/addbuyer")
	public Buyer addBuyer(@RequestBody Buyer buyer) {
		System.out.println("In Buyer adding Controller");
		System.out.println(buyer);
		 return service.addBuyer(buyer);
	}
	@DeleteMapping("/deletebuyer/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") String oid) {
		System.out.println("Delete Customer with ID = " + oid + "...");
         service.deleteCustomer(oid);
		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}
	@PostMapping("/validatebuyer")
public Buyer validateUser(@RequestBody Buyer userlog) {
		Buyer binfo= service.validateUser(userlog);
	     return binfo;
}
	@GetMapping("/getbuyers")
	public List<Buyer> getAllCustomers() {
		System.out.println("Get all Customers...");
		return service.getAllCustomers();
	}

	
}
