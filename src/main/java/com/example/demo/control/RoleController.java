package com.example.demo.control;

import com.example.demo.model.PlayerMsg;
import com.example.demo.service.imp.RoleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/")
public class RoleController {

    @Autowired
    RoleServiceImp roleServiceImp;
    @Autowired
    HttpServletRequest request;


    //角色信息加载
    @RequestMapping(value="/initPlayerMsg")
    @ResponseBody
    public PlayerMsg initPlayerMsg(){
        /*
          注意这里，需要将psg信息，塞进redis里一份（这个服务器内存）
          再放进session里一份，session相当于浏览器本地缓存了
          这样在取对象时，安全又方便
         */
        PlayerMsg psg = roleServiceImp.initPlayer("184500237");
        HttpSession session = request.getSession();
        session.setAttribute("PlayerMsg",psg);
        return psg;
    }


}
