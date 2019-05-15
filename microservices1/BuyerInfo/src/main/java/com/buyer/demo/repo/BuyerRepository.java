package com.buyer.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.buyer.demo.pojo.Buyer;



public interface BuyerRepository extends MongoRepository<Buyer, String>{
	
}
