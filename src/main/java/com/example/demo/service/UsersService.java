package com.example.demo.service;

import com.example.demo.model.Player;

public interface UsersService {
     Player Login(int g_id, String g_pwd);
     int Register( int g_id, String g_pwd);
}
