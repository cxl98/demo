package com.example.demo.service;

import com.example.demo.model.User;

public interface UsersService {
     User Login(int g_id, String g_pwd);
     User Register( int g_id, String g_pwd);
}
