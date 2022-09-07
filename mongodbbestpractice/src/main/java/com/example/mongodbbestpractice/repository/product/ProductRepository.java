package com.example.mongodbbestpractice.repository.product;

import com.example.mongodbbestpractice.model.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<Product, String> {

}
