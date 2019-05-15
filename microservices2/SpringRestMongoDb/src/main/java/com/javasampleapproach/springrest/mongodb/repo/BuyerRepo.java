package com.javasampleapproach.springrest.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javasampleapproach.springrest.mongodb.model.BuyerData;


public interface BuyerRepo extends  MongoRepository<BuyerData, String> {

}
