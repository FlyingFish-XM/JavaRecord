package com.wkx.pojo;

/**
 * @author kaixuan.wang
 * @date 2021年07月21日 18:44
 */
public class Phone {

    private String name;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
