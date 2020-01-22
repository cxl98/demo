package com.example.demo.dao;

import com.example.demo.model.Player;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapping {
     Player Login(int g_id, String g_pwd);
     int Register(int g_id,String g_pwd);
}
