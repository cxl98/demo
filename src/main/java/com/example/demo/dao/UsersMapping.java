package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapping {
     User Login(int g_id, String g_pwd);
     int Register(int g_id,String g_pwd);
}
