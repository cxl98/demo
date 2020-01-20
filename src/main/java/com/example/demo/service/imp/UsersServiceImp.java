package com.example.demo.service.imp;

import com.example.demo.dao.UsersMapping;
import com.example.demo.model.User;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "UsersService")
public class UsersServiceImp implements UsersService {

    @Autowired
    private UsersMapping users;

    @Override
    public User Login(String g_id, String pwd) {
        return users.Login(g_id, pwd);
    }

    @Override
    public int Register(int uid,String u_id, String pwd, String name) {
        return users.Register(uid,u_id, pwd, name);
    }


}
