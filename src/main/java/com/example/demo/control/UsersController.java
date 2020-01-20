package com.example.demo.control;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.User;
import com.example.demo.service.imp.UsersServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    private UsersServiceImp us;

    @RequestMapping(value = "/home/login",method = RequestMethod.POST)
    public String Login(@RequestBody JSONObject json){

        User u = JSON.parseObject(json.toString(), User.class);
        System.out.println(u.getU_id());

        if (us.Login(u.getU_id(),u.getPwd())!=null){
            System.out.println("ok");
            return "true";
        }else {
            System.out.println("no");
            return "false";
        }
    }

    @RequestMapping(value = "/home/Register",method = RequestMethod.POST)
    public String Register(@RequestBody JSONObject json){
        System.out.println(json);
        User u = JSON.parseObject(json.toString(), User.class);
        int newNum = (int)((Math.random()*9+1)*100000);

        System.out.println(u.toString());
        if (us.Register(newNum,u.getU_id(),u.getPwd(),u.getUsername())==1){
            return "true";
        }else {
            return "false";
        }
    }

}
