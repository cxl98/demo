package com.example.demo.service;

/**
 * 用于整合 修饰 服务器提示的弹窗
 *
 * 如
 * 购买成功
 * 购买失败
 * 角色创建成功
 * 金币不足
 * 战斗胜利
 * 。。。
 * 等
 *
 */
public interface ServerMessageService {

    String buySuccess(int money);

    String buyError(int money);





}
