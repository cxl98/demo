package com.example.demo.service;

import com.example.demo.model.User;

public interface UsersService {
     User Login(int g_id, String g_pwd);
     int Register( int g_id, String g_pwd);
}
