package com.example.demo.control;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Users;

import com.example.demo.service.imp.UsersServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    private UsersServiceImp us;

    @RequestMapping(value = "/home/login",method = RequestMethod.POST)
    public String Login(@RequestBody JSONObject json){
        Users u = JSON.parseObject(json.toString(), Users.class);
        System.out.println(u.toString());
        if (us.Login(u.getG_id(),u.getG_pwd())!=null){
            return "true";
        }else {
            return "false";
        }
    }


    @RequestMapping(value = "/home/Register",method = RequestMethod.POST)
    public String Register(@RequestBody JSONObject json){
        Users u = JSON.parseObject(json.toString(), Users.class);
        System.out.println(u.toString());
        if (us.Register(u.getG_id(),u.getG_pwd())!=null){
            return "true";
        }else {
            return "false";
        }
    }
}
