package com.OLXS.Service;

import java.util.List;
import java.util.Optional;

import com.OLX.Model.Product;

public interface ProductService {

	String addProduct(Product ptod);

	Optional<Product> buyProduct(String pId, String buyerId);

	List<Product> viewAllProduct();

	List<Product> findbyPrice(double price);

	List<Product> Status(String status);

	String UpdateProduct(Product product);

	String DeleteProduct(String pId);
}
