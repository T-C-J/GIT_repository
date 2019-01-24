package com.tcj.startboot.entity;

import lombok.Data;

@Data
public class User {
    private String name;
    private String type;

    public User(String name, String type) {
        this.name = name;
        this.type = type;
    }

    protected void ll(){
        System.out.println("----");
    }

    public User() {
    }

    public boolean isAdmin(){
        if("admin".equals(type)){
            return true;
        }else {
            return false;
        }
    }
}
