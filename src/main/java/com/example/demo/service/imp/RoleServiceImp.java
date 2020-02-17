package com.example.demo.service.imp;

import com.example.demo.dao.*;
import com.example.demo.model.*;
import com.example.demo.service.RoleService;
import com.example.demo.staticValue.Equipment;
import com.example.demo.staticValue.Role;
import com.example.demo.utils.SplitEquip;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@MapperScan("com.example.demo.dao")
public class RoleServiceImp implements RoleService {

    @Autowired
    private GameDataMapper gameDataMapper;
    @Autowired
    private EquipMsgMapper equipMsgMapper;
    private static int career;

    @Autowired
    private ServerMessageImp messageImp;

    private PlayerMsg newPlayer = new PlayerMsg();
    private Attribute newPlayerAttr =new Attribute();



    @Autowired
    RoleMapping role;

    @Override
    public Attribute Attr(Attribute attr) {
        return role.Attr(attr) ;
    }


    @Override
    public PlayerMsg initPlayer(String user_id) {
        GameData gd = gameDataMapper.getDameDataById(user_id);
        newPlayer.setUser_id(user_id);
        newPlayer.setUsername(gd.getUsername());
        newPlayerAttr.setRole(gd.getCareer());
        career=gd.getCareer();
        String bags=gd.getEquipment();
        newPlayer.setBag(getBags(bags));//调取背包
        EquipMsg[] equipped=getEquipped(gd.getEquipped());//调取已装备
        newPlayer.setEquipped(equipped);
        changeAttr(equipped);
        newPlayer.setPlayerAttr(newPlayerAttr);
        newPlayer.setMoney(gd.getMoney());
        return newPlayer;
    }

    @Override
    public Attribute equippedChange(int index, int equipId) {
        /*
            从hash中拿出装备，修改玩家已装备的数组，然后还要进行玩家数据更新
         */
        newPlayer.getEquipped()[index]=Equipment.equipHash.get(equipId);
        changeAttr(newPlayer.getEquipped());

        return newPlayer.getPlayerAttr();
    }

    @Override
    public int getMoney(int before, int money) {
        newPlayer.setMoney(before+money);
        return newPlayer.getMoney();
    }

    @Override
    public String buyEquipment(int equipmentId) {
        int dValue=Equipment.equipHash.get(equipmentId).getEq_value()-newPlayer.getMoney();
        if(dValue>0){
            return messageImp.buyError(dValue);
        }else{
            newPlayer.getBag().add(Equipment.equipHash.get(equipmentId));
            newPlayer.setMoney(0-dValue);
            return messageImp.buySuccess(newPlayer.getMoney());
        }
    }

    @Override
    public String soleEquipment(int index,int equipmentId) {
        newPlayer.setMoney(newPlayer.getMoney()+(int)(0.8*Equipment.equipHash.get(equipmentId).getEq_value()));
        newPlayer.getBag().remove(index);
        return "出售成功";
    }

    @Override
    public String getEquipment(int equipmentId) {
        newPlayer.getBag().add(Equipment.equipHash.get(equipmentId));
        return "获得装备"+Equipment.equipHash.get(equipmentId).getEq_name();
    }

    @Override
    public List<EquipMsg> checkBags() {
        return newPlayer.getBag();
    }

    /**
     *
     * @param equipped 是数据库中存的一串序列
     * @return 返回的是装备数组
     */
    private EquipMsg[] getEquipped(String equipped){
        System.out.println(equipped);
        int[] eq = SplitEquip.getEquipped(equipped);
        System.out.println("int:eq //"+ Arrays.toString(eq));
        EquipMsg[] equipMsg = new EquipMsg[]{null,null,null,null,null,null,null,null};
        for(int i=0;i<eq.length;i++){
            if(eq[i]!=0){
                equipMsg[i]= Equipment.equipHash.get(eq[i]);
            }
        }
        return equipMsg;
    }

    private List<EquipMsg> getBags(String bags){
        System.out.println(bags);
        return equipMsgMapper.getEquipMents(SplitEquip.getEquipment(bags));
    }

    private void changeAttr(EquipMsg[] equipped){
        newPlayerAttr.setDamage(addDamage(equipped));
        newPlayerAttr.setMp(addMP(equipped));
        newPlayerAttr.setHp(addHP(equipped));
        newPlayerAttr.setDef(addDef(equipped));
    }

    private int addHP(EquipMsg[] equipped){
        //血
        int extraHp=0;
        for (EquipMsg equipMsg : equipped) {
            if(equipMsg!=null){
                extraHp += equipMsg.getEq_hp();
            }
        }
        return roleAddHpStrength(extraHp);
    }

    private int addMP(EquipMsg[] equipped){
        //蓝
        int extraMp=0;
        for (EquipMsg equipMsg : equipped) {
            if(equipMsg!=null){
                extraMp += equipMsg.getEq_mp();
            }
        }
        return roleAddMpStrength(extraMp);

    }

    private int addDef(EquipMsg[] equipped){
        //防御
        int extraDef=0;
        for (EquipMsg equipMsg : equipped) {
            if(equipMsg!=null) {
                extraDef += equipMsg.getPhy_def();
            }
        }
        return roleAddDefStrength(extraDef);

    }

    private int addDamage(EquipMsg[] equipped){
        //攻击
        int extraDamage=0;
        for (EquipMsg equipMsg : equipped) {
            if(equipMsg!=null){
                extraDamage += equipMsg.getAttack();
            }
        }
        return roleAddAttStrength(extraDamage);

    }

    //角色相加策略
    private int roleAddHpStrength(int extra){
        if (career == Role.ROLE_MAGIC){
            return Role.MAGIC_HP+extra;
        }else if(career == Role.ROLE_KNIGHT){
            return Role.KNIGHT_HP+extra;
        }else if(career == Role.ROLE_SWORD){
            return Role.SWORD_HP+extra;
        }else{
            return 0;
        }
    }
    //角色相加策略
    private int roleAddMpStrength(int extra){
        if (career == Role.ROLE_MAGIC){
            return Role.MAGIC_MP+extra;
        }else if(career == Role.ROLE_KNIGHT){
            return Role.KNIGHT_MP+extra;
        }else if(career == Role.ROLE_SWORD){
            return Role.SWORD_MP+extra;
        }else{
            return 0;
        }
    }
    //角色相加策略
    private int roleAddDefStrength(int extra){
        if (career == Role.ROLE_MAGIC){
            return Role.MAGIC_DEFEND+extra;
        }else if(career == Role.ROLE_KNIGHT){
            return Role.KNIGHT_DEFEND+extra;
        }else if(career == Role.ROLE_SWORD){
            return Role.SWORD_DEFEND+extra;
        }else{
            return 0;
        }
    }
    //角色相加策略
    private int roleAddAttStrength(int extra){
        if (career == Role.ROLE_MAGIC){
            return Role.MAGIC_DAMAGE+extra;
        }else if(career == Role.ROLE_KNIGHT){
            return Role.KNIGHT_DAMAGE+extra;
        }else if(career == Role.ROLE_SWORD){
            return Role.SWORD_DAMAGE+extra;
        }else{
            return 0;
        }
    }


}
