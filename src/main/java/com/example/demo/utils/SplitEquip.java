package com.example.demo.utils;


import com.example.demo.model.EquipMsg;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SplitEquip {

    /**
     *
     * @param str 背包装备序列1,2,3,4
     * @return
     */
    public static List<Integer> getEquipment(String str){

        List<Integer> list = new ArrayList<>();

        String[] strings = str.split(",");
        for (String string : strings) {
            list.add(Integer.valueOf(string));
        }
        return list;
    }

    /**
     *
     * @param str 已装备的一串序列 0:2,6:4
     * @return 装备栏数组 0表示没装
     */
    public static int[] getEquipped(String str){
        int[] eqp = new int[]{0,0,0,0,0,0,0,0};
        String[] strings = str.split(",");
        for(String string:strings){
            int index=Integer.valueOf(string.split(":")[0]);
            eqp[index]=Integer.valueOf(string.split(":")[1]);
        }
        return eqp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getEquipped("0:2,6:4")));
    }
}
