package com.example.demo.dao;

import com.example.demo.model.EquipMsg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipMsgMapper {



    EquipMsg add(EquipMsg msg);
    int delete(int id);
    EquipMsg getEquipMsgByid(int id);



    List<EquipMsg> getEquipMents(List<Integer> list);


}
