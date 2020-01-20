package com.example.demo.control;

import com.example.demo.service.imp.GameDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameDataController {
    @Autowired
    GameDataServiceImpl gameDataService;
}
