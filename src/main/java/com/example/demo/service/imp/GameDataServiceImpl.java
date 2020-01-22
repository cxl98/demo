package com.example.demo.service.imp;

import com.example.demo.dao.GameDataImp;
import com.example.demo.dao.GameDataMapper;
import com.example.demo.model.GameData;
import com.example.demo.service.GameDataService;
import org.springframework.stereotype.Service;

@Service
public class GameDataServiceImpl implements GameDataService {

    GameDataMapper gameDataMapper = new GameDataImp();

    @Override
    public GameData add(GameData data) {
        return null;
    }

    @Override
    public int delete(String user_id) {
        return 0;
    }

    @Override
    public int update(String user_id) {
        return 0;
    }

    @Override
    public GameData getDameDataById(String user_id) {
        return null;
    }




}
