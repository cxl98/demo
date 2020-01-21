package com.example.demo.control;

import com.example.demo.service.imp.EquipMsgServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipMsgController {
    @Autowired
    EquipMsgServiceImpl equipMsgService;
}
