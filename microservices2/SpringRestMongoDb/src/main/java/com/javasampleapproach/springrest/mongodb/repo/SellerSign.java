package com.javasampleapproach.springrest.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javasampleapproach.springrest.mongodb.model.SellerSignup;



public interface SellerSign extends MongoRepository<SellerSignup, String> {

}
