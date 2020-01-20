package com.example.demo.dao;

import com.example.demo.model.EquipMsg;
import org.springframework.stereotype.Repository;


@Repository
public interface EquipMsgMapper {

    EquipMsg add(EquipMsg msg);
    int delete(int id);
    EquipMsg getEquipMsgByid(int id);
}
