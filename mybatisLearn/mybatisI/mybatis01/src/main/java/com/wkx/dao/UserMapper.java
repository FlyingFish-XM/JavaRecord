package com.wkx.dao;

import com.wkx.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUser();

    List<User> getUserById(int id);

    int insertUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);

    int updateUserMap(Map<String,Object> map);
}
