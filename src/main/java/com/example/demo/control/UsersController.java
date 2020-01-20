package com.example.demo.control;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.User;
import com.example.demo.service.imp.UsersServiceImp;
import com.example.demo.util.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    private UsersServiceImp us;

    @RequestMapping(value = "/home/login",method = RequestMethod.POST)
    public ReturnT<String> Login(@RequestBody JSONObject json){

        User u = JSON.parseObject(json.toString(), User.class);
        System.out.println(u.getU_id());

        if (us.Login(u.getUid(),u.getPwd())!=null){
            System.out.println("ok");
            return new ReturnT<>(ReturnT.SUCCESS_CODE,"成功了");
        }else {
            System.out.println("no");
            return new ReturnT<>(ReturnT.FAIL_CODE,"帐号密码不能为空,");
        }

    }

    @RequestMapping(value = "/home/Register",method = RequestMethod.POST)
    public ReturnT<String> Register(@RequestBody JSONObject json){
        System.out.println(json);
        User u = JSON.parseObject(json.toString(), User.class);
        int newNum = (int)((Math.random()*9+1)*100000);

        System.out.println(u.toString());
        if (us.Register(u.getUid(),u.getU_id())==1){
            return new ReturnT<>(ReturnT.SUCCESS_CODE,"成功了");
        }else {
            return new ReturnT<>(ReturnT.FAIL_CODE,"帐号密码不能为空");
        }
    }

}
