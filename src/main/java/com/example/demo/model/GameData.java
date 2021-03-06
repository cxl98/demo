package com.example.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class GameData {
    int id;
    String user_id;
    String username;
    int strength;
    int fight_count;
    String equipment;
    int money;
    int career;
    String equipped;
    Date res_data;
    Date online_time;

}
