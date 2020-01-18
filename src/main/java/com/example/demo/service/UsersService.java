package com.example.demo.service;

import com.example.demo.model.User;

public interface UsersService {
    public User Login(int g_id, String g_pwd);
    public User Register( int g_id, String g_pwd);
}
