package com.example.demo.service;

import com.example.demo.model.Attribute;
import com.example.demo.model.EquipMsg;
import com.example.demo.model.PlayerMsg;

import java.util.List;

public interface RoleService   {


    Attribute Attr(Attribute attr);

    /**
     *
     * @return
     * 玩家初始化，先是加载game_data表中的所有数据
     *
     * 然后通过已装备，获取的字符串，工具类转成list，
     * 再调用获取装备信息的方法查找装备
     *
     * 得知玩家职业后，通过职业属性常量与装备信息相加，得到玩家的角色属性 Attribute
     *
     * 然后加载背包中的装备
     *
     * 加载好友列表
     *
     * 最终集合在一个对象中
     */
    PlayerMsg initPlayer(String user_id);


    /**
     *
     * @param index 指哪个装备槽
     * @param equipId 指装备id
     * @return 给前端返回装备后的玩家信息（其实也可以在前端做运算）
     *
     * 前端告诉你是哪个位置的装备变更了就行，更新即可，后端不需要知道是装备还是卸下。。。
     * 没有是null占位
     */
    Attribute equippedChange(int index,int equipId);





}
