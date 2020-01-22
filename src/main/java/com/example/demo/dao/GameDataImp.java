package com.example.demo.dao;

import com.example.demo.model.GameData;
import com.example.demo.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class GameDataImp implements GameDataMapper {

    public static SqlSession sqlSession ;

    static {
        sqlSession= MybatisUtil.getSqlSession();
    }

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
        return sqlSession.selectOne("gameData",user_id);
    }
}
