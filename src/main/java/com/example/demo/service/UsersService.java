package com.example.demo.service;

import com.example.demo.model.User;

public interface UsersService {

    public User Login(String u_id, String pwd);
    public int Register(int uid,String u_id,String pwd,String name);

}
