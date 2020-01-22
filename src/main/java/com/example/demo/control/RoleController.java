package com.example.demo.control;

import com.example.demo.model.PlayerMsg;
import com.example.demo.service.imp.RoleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RoleController {

    @Autowired
    RoleServiceImp roleServiceImp;

    //角色信息加载
    @RequestMapping(value="/initPlayerMsg")
    public PlayerMsg initPlayerMsg(){
        return roleServiceImp.initPlayer("184500237");
    }
}
