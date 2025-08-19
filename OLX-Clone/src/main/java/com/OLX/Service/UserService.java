package com.OLX.Service;

import com.OLX.Model.User;

public interface UserService {

	String registerUser(User user)throws Exception;

	User login(String email, String password)throws Exception;
}
