package com.example.demo.model;

import lombok.Data;

@Data
public class EquipMsg {
    int id;
    int equip_id;
    String eq_name;
    int attack;
    int phy_def;
    int eq_hp;
    int eq_mp;
    int eq_value;
    int eq_place;
    String details;
    String quality;

}
