package com.wkx.dao;

import com.wkx.pojo.Teacher;

import java.util.List;

/**
 * @author kaixuan.wang
 * @date 2021年07月17日 12:46
 */
public interface TeacherMapper {

    public List<Teacher> getTeacher(int id);

}
