package com.example.demo.service.imp;

import com.example.demo.dao.UsersMapping;
import com.example.demo.model.Users;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "UsersService")
public class UsersServiceImp implements UsersService {

    @Autowired
    private UsersMapping users;

    @Override
    public Users Login(int g_id, String pwd) {
        return users.Login(g_id, pwd);
    }

    @Override
    public Users Register(int g_id, String g_pwd) {
        return users.Register(g_id, g_pwd);
    }

}
