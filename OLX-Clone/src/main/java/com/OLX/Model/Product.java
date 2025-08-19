package com.OLX.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "Product")
public class Product {

	@Id
	private String id;
	private String productId;
	private String title;
	private String description;
	private double price;
	private String status; // AVAILABLE / SOLD
	private String userId;
}
