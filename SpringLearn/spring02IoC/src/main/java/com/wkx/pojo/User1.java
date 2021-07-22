package com.wkx.pojo;

/**
 * @author kaixuan.wang
 * @date 2021年07月21日 11:20
 */
public class User1 {

    private String name;
    private String sex;

    public User1(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
