package com.example.demo.service.imp;

import com.example.demo.dao.*;
import com.example.demo.model.Attribute;
import com.example.demo.model.EquipMsg;
import com.example.demo.model.GameData;
import com.example.demo.model.PlayerMsg;
import com.example.demo.service.RoleService;
import com.example.demo.staticValue.Role;
import com.example.demo.utils.MybatisUtil;
import com.example.demo.utils.SplitEquip;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@MapperScan("com.example.demo.dao")
public class RoleServiceImp implements RoleService {

    private GameDataMapper gameDataMapper = new GameDataImp();

    private EquipMsgMapper equipMsgMapper = new EquipMsgImp();

    private static int carrer;

    @Autowired
    RoleMapping role;

    @Override
    public Attribute Attr(Attribute attr) {
        return role.Attr(attr) ;
    }


    @Override
    public PlayerMsg initPlayer(String user_id) {
        GameData gd = gameDataMapper.getDameDataById(user_id);
        PlayerMsg newPlayer = new PlayerMsg();
        Attribute newPlayerAttr = new Attribute();

        newPlayer.setUser_id(user_id);
        newPlayer.setUsername(gd.getUsername());

        newPlayerAttr.setRole(gd.getCareer());

        carrer=gd.getCareer();

        String bags=gd.getEquipment();

        newPlayer.setBag(getBags(bags));//调取背包

        List<EquipMsg> equipped=getEquipped(gd.getEquipped());//调取已装备

        newPlayerAttr.setEquipped(equipped);
        newPlayerAttr.setHp(addHP(equipped));
        newPlayerAttr.setDef(addDef(equipped));
        newPlayerAttr.setMp(addMP(equipped));
        newPlayerAttr.setDamage(addDamage(equipped));

        newPlayer.setPlayerAttr(newPlayerAttr);


        return newPlayer;
    }
    private List<EquipMsg> getEquipped(String equipped){
        System.out.println(equipped);
        //转换成装备list
        return equipMsgMapper.getEquipMents(SplitEquip.getEquipment(equipped));
    }

    private List<EquipMsg> getBags(String bags){
        System.out.println(bags);
        return equipMsgMapper.getEquipMents(SplitEquip.getEquipment(bags));
    }

    private int addHP(List<EquipMsg> equipped){
        //血
        int extraHp=0;
        for (EquipMsg equipMsg : equipped) {
            extraHp += equipMsg.getEq_hp();
        }
        return roleAddStrength(extraHp);
    }

    private int addMP(List<EquipMsg> equipped){
        //蓝
        int extraMp=0;
        for (EquipMsg equipMsg : equipped) {
            extraMp += equipMsg.getEq_mp();
        }
        return roleAddStrength(extraMp);

    }

    private int addDef(List<EquipMsg> equipped){
        //防御
        int extraDef=0;
        for (EquipMsg equipMsg : equipped) {
            extraDef += equipMsg.getPhy_def();
        }
        return roleAddStrength(extraDef);

    }

    private int addDamage(List<EquipMsg> equipped){
        //攻击
        int extraDamage=0;
        for (EquipMsg equipMsg : equipped) {
            extraDamage += equipMsg.getAttack();
        }
        return roleAddStrength(extraDamage);

    }

    //角色相加策略
    private int roleAddStrength(int extra){
        if (carrer == Role.ROLE_MAGIC){
            return Role.MAGIC_HP+extra;
        }else if(carrer == Role.ROLE_KNIGHT){
            return Role.KNIGHT_HP+extra;
        }else if(carrer == Role.ROLE_SWORD){
            return Role.SWORD_HP;
        }else{
            return 0;
        }
    }

}
