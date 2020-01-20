package com.example.demo.service;

import com.example.demo.model.User;

public interface UsersService {
     User Login(String g_id, String g_pwd);
     int Register( int uid,String u_id, String pwd, String name);
}
