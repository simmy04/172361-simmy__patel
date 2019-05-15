package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.pojo.Seller;

public interface SellerRepo extends MongoRepository<Seller,String>{

}
