package com.example.demo.service;

import com.example.demo.model.EquipMsg;

import java.util.HashMap;
import java.util.List;

public interface EquipMsgService {
    EquipMsg add(EquipMsg msg);
    int delete(int id);

    EquipMsg getEquipMsgByid(int id);

    /**
     *
     * @param list
     * @return
     */
    List<EquipMsg> getEquipMsgByids(List<Integer> list);


}
