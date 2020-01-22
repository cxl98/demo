package com.example.demo.dao;

import com.example.demo.model.EquipMsg;
import com.example.demo.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EquipMsgImp implements EquipMsgMapper {

    public static SqlSession sqlSession ;

    static {
        sqlSession= MybatisUtil.getSqlSession();
    }

    @Override
    public EquipMsg add(EquipMsg msg) {
        return null;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public EquipMsg getEquipMsgByid(int id) {
        return null;
    }

    @Override
    public List<EquipMsg> getEquipMents(List<Integer> list) {
        return sqlSession.selectList("equipments",list);
    }
}
