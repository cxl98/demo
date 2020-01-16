package com.example.demo.service;

import com.example.demo.model.Users;

public interface UsersService {
    public Users Login(int g_id, String g_pwd);
    public Users Register( int g_id, String g_pwd);
}
