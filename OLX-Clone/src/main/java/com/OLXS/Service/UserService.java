package com.OLXS.Service;

import com.OLX.Model.User;

public interface UserService {

	String registerUser(User user);
	
    User login(String email, String password);
}
