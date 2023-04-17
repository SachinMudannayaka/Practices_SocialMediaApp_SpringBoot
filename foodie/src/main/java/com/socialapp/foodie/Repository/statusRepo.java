package com.socialapp.foodie.Repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socialapp.foodie.Entity.Status;

@Repository
public interface statusRepo extends CrudRepository<Status,Integer> {


    Status save(Status save);
    ArrayList <Status> findAll();
    
}
