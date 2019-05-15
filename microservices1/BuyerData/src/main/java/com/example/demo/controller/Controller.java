package com.example.demo.controller;

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

import com.example.demo.pojo.BuyerData;
import com.example.demo.service.BuyerService;

@CrossOrigin(origins="http://localhost:4200") 
@RestController
public class Controller {
	
	@Autowired
	BuyerService service;
	
	
	@GetMapping("/getbuyersdata")
	public List<BuyerData> getData() {
		System.out.println("Get all Customers...");
		return service.getBuyerInfo();
	}
	
	@PostMapping("/buyersdata")
	public BuyerData postBuyerInfo(@RequestBody BuyerData customer) {
          System.out.println("post buyerinfo");
      
		return service.postBuyerInfo(customer);
	}
	
}
