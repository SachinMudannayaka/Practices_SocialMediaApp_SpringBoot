package com.socialapp.foodie.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialapp.foodie.Entity.Status;
import com.socialapp.foodie.Repository.statusRepo;

@Service
public class statusService {
@Autowired
statusRepo statusRepo;

@Autowired
userService userService;

    public Status submitDataIntoDB(Status status){
        return statusRepo.save(status);
    }
   
    public ArrayList<Status> retriveStatus(){
        ArrayList<Status> statusList=statusRepo.findAll();
        for(int i=0;i<statusList.size();i++){
             Status statusItem=statusList.get(i);
           statusItem.setUserName( userService.displayMetaDataOfUser(statusItem.getStatusId()).getUserName());
        }
        return statusList;
    }
}
