package com.example.demo.service.imp;

import com.example.demo.dao.EquipMsgMapper;
import com.example.demo.model.EquipMsg;
import com.example.demo.service.EquipMsgService;
import com.example.demo.staticValue.Equipment;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EquipMsgServiceImpl implements EquipMsgService , InitializingBean {

    @Autowired
    EquipMsgMapper equipMsgMapper;

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
    public List<EquipMsg> getEquipMsgByids(List<Integer> list) {
        List<EquipMsg> listMsgs = new ArrayList<>();
        for (Integer integer : list) {
            listMsgs.add(Equipment.equipHash.get(integer));
        }
        return listMsgs;
    }

    /**
     * 服务器初始化加载装备，库里的装备都塞hash里
     *
     * 由于用mybatis直接返回map时有不便，自定义转map
     */
    private void initLoadEquipment() {
        List<EquipMsg> list=equipMsgMapper.getAllEquipMents();
        addInHash(list);
        System.out.println("--------------已加载完所有装备信息至HashMap-------------------");
    }
    private void addInHash(List<EquipMsg> list){
        for (EquipMsg ems : list) {
            Equipment.equipHash.put(ems.getEquip_id(),ems);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        initLoadEquipment();
    }
}
