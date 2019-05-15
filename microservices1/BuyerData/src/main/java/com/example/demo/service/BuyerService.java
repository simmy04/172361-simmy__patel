package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.BuyerData;
import com.example.demo.repository.BuyerRepository;


@Service
public class BuyerService {
	@Autowired
	  BuyerRepository res;
	
	public List<BuyerData> getBuyerInfo() {
		System.out.println("Get all Details...");

		List<BuyerData> info = new ArrayList<>();
		res.findAll().forEach(info::add);

		return info;
	}
	public BuyerData postBuyerInfo(BuyerData seller) {
	    System.out.println("In seller now");
	   
	   
	    BuyerData binfo = res.save(new BuyerData(seller.getSname(),seller.getBname(),seller.getTitle(),seller.getRating()));
		return binfo;
	}
	public ResponseEntity<String> deleteCustomer(String oid) {
		System.out.println("Delete Customer with ID = " + oid + "...");

		res.deleteById(oid);

		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}
}
