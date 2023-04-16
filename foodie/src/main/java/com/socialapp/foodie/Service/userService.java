package com.socialapp.foodie.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.socialapp.foodie.Entity.Users;
import com.socialapp.foodie.Repository.userRepo;

@Service
public class userService {
@Autowired
userRepo userRepo;

    public Users submitMetaDataOfUser(Users user){
        return userRepo.save(user);
        
    }
    public Users displayMetaDataOfUser(String userid){
        return userRepo.findByUserId(userid);
    }
}
