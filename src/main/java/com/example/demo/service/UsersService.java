package com.example.demo.service;

import com.example.demo.model.Player;

public interface UsersService {
     Player Login(int g_id, String g_pwd);
     int Register( int g_id, String g_pwd);


     /**
      *
      * @return 用于判断是否在线
      *
      * 方法可能需要启动多线程时钟判断玩家是否在线
      *
      * 在线时允许进行多种玩家操作
      * 离线时进行内存中对象的安全处理，安全的更新数据库并释放内存资源
      */
     boolean isOnline();
}
