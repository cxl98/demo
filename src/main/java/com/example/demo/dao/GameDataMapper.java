package com.example.demo.dao;

import com.example.demo.model.GameData;
import org.springframework.stereotype.Repository;

@Repository
public interface GameDataMapper {
        GameData add(GameData data);
        int delete(String user_id);
        int update(String user_id);
        GameData getDameDataById(String user_id);
}
