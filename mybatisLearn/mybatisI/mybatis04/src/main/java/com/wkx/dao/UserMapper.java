package com.wkx.dao;

import com.wkx.pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * @author kaixuan.wang
 * @date 2021年07月06日 10:36
 */
public interface UserMapper {

    List<User> getUser1();

    List<User> getUsers();

    List<User> getUsersMap(Map<String,Integer> map);

    @Select("select * from user where id = #{uid}")
    User getUserById(@Param("uid") Integer id);


    List<User> getUserList(RowBounds rowBounds);



    // 使用注解
    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
    Integer insertUser(User user);

    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id} ")
    Integer updateUser(User user);

    @Delete("delete from user where id=#{id}")
    Integer deleteUser(Integer id);

}
