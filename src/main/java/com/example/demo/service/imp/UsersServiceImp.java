package com.example.demo.service.imp;

import com.example.demo.dao.UsersMapping;
import com.example.demo.model.Player;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "UsersService")
public class UsersServiceImp implements UsersService {

    @Autowired
    private UsersMapping users;
    @Override
    public Player Login(int g_id, String g_pwd) {
        return users.Login(g_id, g_pwd);
    }

    @Override
    public int Register(int g_id, String g_pwd) {
        return users.Register(g_id,g_pwd);
    }


    @Override
    public boolean isOnline() {
        return false;
    }
}
