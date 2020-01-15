package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Users {
    Users Login(@Param("g_id") int g_id,@Param("g_pwd") String g_pwd);
    Users Register(@Param("g_id") int g_id,@Param("g_pwd") String g_pwd);
}
