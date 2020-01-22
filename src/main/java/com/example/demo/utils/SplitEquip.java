package com.example.demo.utils;


import com.example.demo.model.EquipMsg;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class SplitEquip {

    /**
     * 规定一个获取装备的方法
     * 数据库中存的id为[1,2,3,4]数组式的
     */

    public static List<Integer> getEquipment(String str){
        List<Integer> list = new ArrayList<>();

        String[] strings = str.split(",");
        for (String string : strings) {
            list.add(Integer.valueOf(string));
        }
        return list;
    }

    public static void main(String[] args) {
        getEquipment("1,2,3,4");
    }
}
