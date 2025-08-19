package com.OLXS.Repositary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OLX.Model.User;

public interface UserRepository extends MongoRepository<User, String>
{

}
