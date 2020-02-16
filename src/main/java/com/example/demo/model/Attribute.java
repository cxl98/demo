package com.example.demo.model;

import lombok.Data;

@Data
//游戏属性
public class Attribute {
    /**
     *
     * 角色面板属性
     *
     *
     */

    private int role;               //角色职业 1法师 2骑士 3剑士
    private int hp;         //血量
    private int mp;         //蓝量
    private int def;        //防御力
    private int damage;     //攻击力

    /*
    .
    .
    .
    */
}
