package com.OLX.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collation = "User")
public class User {

	private String userId;
	private String name;
	private String email;
	private String password;
	private String role; // BUYER / SELLER
}
