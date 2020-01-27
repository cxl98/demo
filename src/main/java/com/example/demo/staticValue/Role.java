package com.example.demo.staticValue;

/**
 * 职业基本信息的常量值
 */
public class Role {


    public static final short ROLE_MAGIC=1;   //法师
    public static final short ROLE_KNIGHT=2;  //骑士
    public static final short ROLE_SWORD=3;   //剑士


    public static final int MAGIC_HP=150;
    public static final int MAGIC_MP=200;
    public static final boolean MAGIC_ATTACK_WAY=true;//false近战，true远程
    public static final int MAGIC_DAMAGE=30;//攻击力
    public static final int MAGIC_DEFEND=20;//防御力

    public static final int KNIGHT_HP=200;
    public static final int KNIGHT_MP=150;
    public static final boolean KNIGHT_ATTACK_WAY=false;
    public static final int KNIGHT_DAMAGE=35;
    public static final int KNIGHT_DEFEND=30;

    public static final int SWORD_HP=160;
    public static final int SWORD_MP=150;
    public static final boolean SWORD_ATTACK_WAY=false;
    public static final int SWORD_DAMAGE=40;
    public static final int SWORD_DEFEND=25;
}
