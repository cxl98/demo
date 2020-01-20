package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapping {
    public User Login(String u_id, String pwd);
    public int Register(int uid,String u_id,String pwd,String name);
}
