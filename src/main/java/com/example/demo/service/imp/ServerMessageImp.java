package com.example.demo.service.imp;

import com.example.demo.service.ServerMessageService;
import org.springframework.stereotype.Service;

@Service
public class ServerMessageImp implements ServerMessageService {


    @Override
    public String buySuccess(int money) {
        return "购买装备成功!\n剩余金币："+money;
    }

    @Override
    public String buyError( int money) {
        return "购买装备失败!\n缺少金币:"+money;
    }

}
