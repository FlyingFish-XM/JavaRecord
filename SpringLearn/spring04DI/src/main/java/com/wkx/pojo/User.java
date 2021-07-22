package com.wkx.pojo;

/**
 * @author kaixuan.wang
 * @date 2021年07月21日 18:44
 */
public class User {

    private String name;
    private Computer computer;
    private Phone phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", computer=" + computer +
                ", phone=" + phone +
                '}';
    }
}
