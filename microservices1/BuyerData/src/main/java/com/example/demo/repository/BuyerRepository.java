package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.pojo.BuyerData;



public interface BuyerRepository extends MongoRepository<BuyerData, String>{
	
}
