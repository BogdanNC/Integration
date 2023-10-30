package com.example.demo2.Repository;

import com.example.demo2.MongoModel.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepo extends MongoRepository<User, String> {
    @Query("{email:'?0'}")
    User findUserByEmail(String email);

    @Query(value = "{username:'?0'}")
    List<User> findAll(String username);


}
