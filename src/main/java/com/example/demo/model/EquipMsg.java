package com.example.demo.model;

import lombok.Data;

@Data
public class EquipMsg {
    int id;
    int equip_id;
    int attack;
    int phy_def;
    int value;
    String details;
    String quality;

}
