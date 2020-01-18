package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapping {
    public User Login(int g_id, String g_pwd);
    public User Register(int g_id,String g_pwd);
}
