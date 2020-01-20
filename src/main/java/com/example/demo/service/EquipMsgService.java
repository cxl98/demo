package com.example.demo.service;

import com.example.demo.model.EquipMsg;


public interface EquipMsgService {
    EquipMsg add(EquipMsg msg);
    int delete(int id);
    EquipMsg getEquipMsgByid(int id);
}
