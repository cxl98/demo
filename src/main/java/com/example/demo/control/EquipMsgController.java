package com.example.demo.control;

import com.example.demo.model.EquipMsg;
import com.example.demo.service.imp.EquipMsgServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EquipMsgController {
    /**
     * 加载装备信息
     */
    @Autowired
    EquipMsgServiceImpl equipMsgService;

    @RequestMapping(value="/showShop")
    @ResponseBody
    public List<EquipMsg> showShop(){
        /*
            展示此商店的装备都有什么
            先以展示所有装备为例。。
         */
        return null;
    }
}
