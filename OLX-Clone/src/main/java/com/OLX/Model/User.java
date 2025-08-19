package com.OLX.Model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Document(collation = "User")
public class User {

	@Id
	private String id;
	private String userId;
	private String name;
	private String email;
	private String password;
	private String role; // BUYER / SELLER
	
	
}
