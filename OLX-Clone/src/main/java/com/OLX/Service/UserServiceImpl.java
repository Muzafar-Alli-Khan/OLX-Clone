package com.OLX.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OLX.Exception.AlreadyExist;
import com.OLX.Exception.Loginfaild;
import com.OLX.Model.User;
import com.OLX.Repositary.UserRepository;

@Service("userserv")
public class UserServiceImpl implements UserService {


	@Autowired
	private UserRepository userRepo;
	
	@Override
	public String registerUser(User user)throws Exception {
		
		  userRepo.findByEmail(user.getEmail()).ifPresent(u -> {
	            throw new AlreadyExist("Email already registered");
	        });
		userRepo.save(user);
		return user.getName()+" :Usre Register successFull thank You";
	}

	@Override
	public User login(String mail, String password)throws Exception {
		
	User user=	userRepo.findByEmail(mail).orElseThrow(()->new Loginfaild("User Not Found"));
		
		if(!user.getPassword().equals(password))
		{
			throw new Loginfaild("Invalid Password");
		}
		return user;
	}

}
