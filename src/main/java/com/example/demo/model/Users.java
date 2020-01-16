package com.example.demo.model;

public class Users {
    int g_id;
    String g_pwd;

    @Override
    public String toString() {
        return "Users{" +
                "g_id=" + g_id +
                ", g_pwd='" + g_pwd + '\'' +
                '}';
    }

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public String getG_pwd() {
        return g_pwd;
    }

    public void setG_pwd(String g_pwd) {
        this.g_pwd = g_pwd;
    }
}
