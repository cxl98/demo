package com.example.demo.control;

import com.example.demo.service.imp.EquipMsgServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EquipMsgController {
    @Autowired
    EquipMsgServiceImpl equipMsgService;
}
