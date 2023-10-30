package com.example.demo2.Controller;

import com.example.demo2.MongoModel.User;
import com.example.demo2.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @Autowired
    UserRepo userItemRepo;

    @RequestMapping("/")
    public String hello() {


        System.out.println(showAllUsers());
        return "hello " ;

    }
    public String showAllUsers() {
      //  userItemRepo.save(new User("3","Bogdan", "lama@lame.ro"));
        User user = userItemRepo.findUserByEmail("lama@lame.ro");
        System.out.println(user.toString());



        return user.getName();
        //userItemRepo.findAll().forEach(item -> System.out.println(getItemDetails(item)));
    }
}
