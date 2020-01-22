package com.example.demo.service;

import com.example.demo.model.Attribute;
import com.example.demo.model.PlayerMsg;

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
}
