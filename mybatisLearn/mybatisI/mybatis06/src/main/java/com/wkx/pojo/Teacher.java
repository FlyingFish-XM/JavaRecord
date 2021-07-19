package com.wkx.pojo;

import java.util.List;

/**
 * @author kaixuan.wang
 * @date 2021年07月17日 12:40
 */
public class Teacher {

    private int id;
    private String name;

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public Teacher(int id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public Teacher() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
