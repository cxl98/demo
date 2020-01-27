package com.example.demo.service;

import com.example.demo.model.GameData;
import com.example.demo.model.PlayerMsg;

/**
 * 在用户下线/上线/或敏感操作时，进行数据落库处理
 */
public interface GameDataService {

    GameData add(GameData data);
    int delete(String user_id);
    int update(String user_id);
    GameData getDameDataById(String user_id);




}
