package com.OLX.Controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.OLX.Model.User;
import com.OLXS.Service.UserService;

@Controller("UserControl")
public class UserController {

	@Autowired
	private  UserService userService;
	
	Scanner sc = new Scanner(System.in);
	
	  public String register()  throws Exception
	  {
	        System.out.println("=== User Registration ===");
	        
	        System.out.println("Enter Your ID");
	        String id = sc.nextLine();
	        
	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Email: ");
	        String email = sc.nextLine();

	        System.out.print("Enter Password: ");
	        String password = sc.nextLine();
	        
	        System.out.println("Enter your Role");
	        String role = sc.nextLine();
	      
	        User user = User.builder()
	        		.userId(id)
	        		.name(name)
	        		.email(email)
	        		.password(password)
	        		.role(role).build();
	        
	        String register = userService.registerUser(user);
	        
	        return register;
	  }
}
