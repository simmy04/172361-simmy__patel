package com.seller.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.seller.demo.pojo.Seller;

public interface Repository extends MongoRepository<Seller, String>{

}
