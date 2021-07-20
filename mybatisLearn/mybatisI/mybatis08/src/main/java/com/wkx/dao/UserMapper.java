package com.wkx.dao;

import com.wkx.pojo.User;

import java.util.List;

/**
 * @author kaixuan.wang
 * @date 2021年07月19日 18:52
 */
public interface UserMapper {

    List<User> getUserCache();

}
