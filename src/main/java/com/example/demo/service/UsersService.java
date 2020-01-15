package com.example.demo.service;

import com.example.demo.dao.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersService {
    Users Login(@Param("g_id") int g_id, @Param("g_pwd") String g_pwd);
    Users Register(@Param("g_id") int g_id,@Param("g_pwd") String g_pwd);
}
