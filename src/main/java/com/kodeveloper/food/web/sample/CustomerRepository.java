package com.kodeveloper.food.web.sample;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Hyojin Bae on 2017/05/29.
 */
public interface CustomerRepository extends MongoRepository<Customer, ObjectId> {
}