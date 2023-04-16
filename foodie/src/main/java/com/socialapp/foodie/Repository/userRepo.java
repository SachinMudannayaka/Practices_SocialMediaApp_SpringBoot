package com.socialapp.foodie.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socialapp.foodie.Entity.Users;

@Repository
public interface userRepo extends CrudRepository<Users,Integer>  {
    Users save(Users user);
    Users findByUserId(String userId);
}
