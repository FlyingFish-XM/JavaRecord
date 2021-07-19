package com.wkx.dao;

import com.wkx.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * @author kaixuan.wang
 * @date 2021年07月19日 11:03
 */
public interface StudentMapper {

    List<Student> getStudentIf(Map<String,Object> map);

    List<Student> getStudentWhere(Map<String,Object> map);

    List<Student> getStudentChoose(Map<String,Object> map);

    int setStudentSet(Map<String,Object> map);

    List<Student> getStudentSql(Map<String,Object> map);

    List<Student> getStudentForEach(Map<String,Object> map);

}
