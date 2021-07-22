package com.wkx.pojo;

/**
 * @author kaixuan.wang
 * @date 2021年07月21日 11:07
 */
public class User {

    private String name;


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
