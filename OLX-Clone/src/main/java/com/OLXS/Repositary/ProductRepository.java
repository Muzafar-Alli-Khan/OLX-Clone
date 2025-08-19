package com.OLXS.Repositary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OLX.Model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
