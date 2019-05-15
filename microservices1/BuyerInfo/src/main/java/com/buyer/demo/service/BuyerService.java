package com.buyer.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.buyer.demo.pojo.Buyer;
import com.buyer.demo.repo.BuyerRepository;
//import com.javasampleapproach.springrest.mongodb.model.Customer;
@Service
public class BuyerService {

	@Autowired
	  BuyerRepository res;
	public Buyer addBuyer(@RequestBody Buyer buyer) {
		System.out.println("In Buyer adding method");
		System.out.println(buyer);
		 res.save(buyer);
	   return buyer;
	}
	public ResponseEntity<String> deleteCustomer(String oid) {
		System.out.println("Delete Customer with ID = " + oid + "...");

		res.deleteById(oid);

		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}
	public Buyer validateUser(Buyer userlog) {
		System.out.println(userlog);
		System.out.println("In controller");
				List<Buyer> login=res.findAll();
			System.out.println(login);
			System.out.println("After repository");
			for(Buyer dblog:login) {
				
				if(dblog.getUname().equals(userlog.getUname())&&dblog.getPass().equals(userlog.getPass())) {
					System.out.println(dblog);
					return dblog;
			}	
	
		}
			return null;
	}
	public List<Buyer> getAllCustomers() {
		System.out.println("Get all Customers...");

		List<Buyer> customers = new ArrayList<>();
		res.findAll().forEach(customers::add);

		return customers;
	}
}
