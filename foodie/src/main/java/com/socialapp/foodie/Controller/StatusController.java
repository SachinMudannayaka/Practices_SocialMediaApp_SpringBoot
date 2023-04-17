package com.socialapp.foodie.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialapp.foodie.Entity.Status;
import com.socialapp.foodie.Service.statusService;

@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    statusService statusService;

    @PostMapping("")
    private Status submiStatus(@RequestBody Status status){
     return statusService.submitDataIntoDB(status);
    }
@GetMapping("")
    private ArrayList<Status> getAllStatus(){
        return statusService.retriveStatus();
    }
}
