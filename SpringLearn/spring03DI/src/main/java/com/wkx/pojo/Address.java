package com.wkx.pojo;

/**
 * @author kaixuan.wang
 * @date 2021年07月21日 12:46
 */
public class Address {
    private String name;
    private String area;
    private String town;


    public Address() {
    }

    public Address(String name, String area, String town) {
        this.name = name;
        this.area = area;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
