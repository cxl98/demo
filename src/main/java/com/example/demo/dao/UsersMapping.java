package com.example.demo.dao;

import com.example.demo.model.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapping {
    public Users Login(int g_id, String g_pwd);
    public Users Register(int g_id,String g_pwd);
}
