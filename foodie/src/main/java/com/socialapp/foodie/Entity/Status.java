package com.socialapp.foodie.Entity;

import java.security.Timestamp;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "Status")
public class Status {
    @Id
    @GeneratedValue
    @NonNull
    private int id;
    
    private String statusId;
    private String userId;
    private String path;
    private String userName;
    private String timeStamp;
    public Status() {
        super();
    }


    
    public Status(int id, String statusId, String userId, String path, String timeStamp) {
        this.id = id;
        this.statusId = statusId;
        this.userId = userId;
        this.path = path;
        this.timeStamp = timeStamp;
    }


    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStatusId() {
        return statusId;
    }
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public String getTimeStamp() {
        return timeStamp;
   }
   public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    
   
    
}
