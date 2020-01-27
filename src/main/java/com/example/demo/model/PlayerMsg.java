package com.example.demo.model;


import lombok.Data;

import java.util.List;

@Data
public class PlayerMsg {

    /**
     * 这里这个对象可以在redis中做缓存，里面的数据用于实时交互
     *
     * 一个玩家的信息包括多个模块，
     * 包括面板，装备，好友列表，
     *
     * 每个模块分开加载
     *
     */

    private String user_id;
    private String username;
    private Attribute playerAttr;   //角色属性
    private List<EquipMsg> bag;     //背包中的装备
    private List<Player> friends;   //好友列表
    private int money;

}
