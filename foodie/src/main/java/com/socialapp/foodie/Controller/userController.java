package com.socialapp.foodie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialapp.foodie.Entity.Users;
import com.socialapp.foodie.Service.userService;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    userService userService;
    
    @PostMapping("")
    private Users submitUser(@RequestBody Users users){
       return userService.submitMetaDataOfUser(users);
        
    }
    @GetMapping("/{userId}")
    private Users getUserDetails(@PathVariable ("userId") String userId){
       return userService.displayMetaDataOfUser(userId);
     
    }


}
