package com.javasampleapproach.springrest.mongodb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.javasampleapproach.springrest.mongodb.model.BuyerData;
import com.javasampleapproach.springrest.mongodb.model.Customer;
import com.javasampleapproach.springrest.mongodb.model.Seller;
import com.javasampleapproach.springrest.mongodb.model.SellerSignup;
import com.javasampleapproach.springrest.mongodb.repo.BuyerRepo;
import com.javasampleapproach.springrest.mongodb.repo.CustomerRepository;
import com.javasampleapproach.springrest.mongodb.repo.SellerRepository;
import com.javasampleapproach.springrest.mongodb.repo.SellerSign;
@org.springframework.stereotype.Service
public class Service {
@Autowired
CustomerRepository repository;
@Autowired
SellerRepository res;
@Autowired
BuyerRepo brep;
@Autowired
SellerSign sinfo;

public List<BuyerData> getBuyerInfo() {
	System.out.println("Get all Details...");

	List<BuyerData> info = new ArrayList<>();
	brep.findAll().forEach(info::add);

	return info;
}
public BuyerData postBuyerInfo(BuyerData seller) {
    System.out.println("In seller now");
   
   
    BuyerData binfo = brep.save(new BuyerData(seller.getSname(),seller.getBname(),seller.getTitle(),seller.getRating()));
	return binfo;
}

	public List<Customer> getAllCustomers() {
		System.out.println("Get all Customers...");

		List<Customer> customers = new ArrayList<>();
		repository.findAll().forEach(customers::add);

		return customers;
	}
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
	public Customer postCustomer(Customer customer) {
     
     
        Customer _customer = repository.save(new Customer(customer.getName(),customer.getEmail(),customer.getUname(),customer.getPass()));
		return _customer;
	}
	public SellerSignup postSeller(SellerSignup seller) {
        System.out.println("In seller info now");
     
        SellerSignup _ssignup = sinfo.save(new SellerSignup(seller.getName(),seller.getEmail(),seller.getUname(),seller.getPass()));
		return _ssignup;
	}
	public ResponseEntity<String> deleteCustomer(String oid) {
		System.out.println("Delete Customer with ID = " + oid + "...");

		res.deleteById(oid);

		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}
	public ResponseEntity<String> deleteAllCustomers() {
		System.out.println("Delete All Customers...");

		repository.deleteAll();

		return new ResponseEntity<>("All customers have been deleted!", HttpStatus.OK);
	}
	

	public Customer validateUser(Customer userlog) {
		System.out.println(userlog);
		System.out.println("In controller");
				List<Customer> login=repository.findAll();
			System.out.println(login);
			System.out.println("After repository");
			for(Customer dblog:login) {
				
				if(dblog.getUname().equals(userlog.getUname())&&dblog.getPass().equals(userlog.getPass())) {
					System.out.println(dblog);
					return dblog;
			}	
	
		}
			return null;
	}
	public SellerSignup validateSeller(Customer userlog) {
		System.out.println(userlog);
		System.out.println("In controller");
		System.out.println(userlog);
			List<SellerSignup> login=sinfo.findAll();
			System.out.println(login);
			System.out.println();
			
			
			System.out.println("After repository");
			System.out.println(login);
			for(SellerSignup dblog:login) {
				System.out.println(dblog);
				if(dblog.getUname().equals(userlog.getUname())&&dblog.getPass().equals(userlog.getPass())) {
					return dblog;
			}	
		
		}
			return null;
	}
}
