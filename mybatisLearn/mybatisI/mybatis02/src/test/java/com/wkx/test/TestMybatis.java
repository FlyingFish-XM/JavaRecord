package com.wkx.test;

import com.wkx.dao.UserMapper;
import com.wkx.pojo.User;
import com.wkx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMybatis {

    @Test
    public void queryUserTest(){
        MybatisUtils mybatisUtils = new MybatisUtils();
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> user = mapper.getUser();
        for (User user1 : user) {
            System.out.println(user1);
        }
        sqlSession.close();

    }

    @Test
    public void queryUserByIdTest(){
        MybatisUtils mybatisUtils = new MybatisUtils();
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userById = mapper.getUserById(1);
        sqlSession.close();
        System.out.println(userById);
    }


    @Test
    public void insertUser(){
        MybatisUtils mybatisUtils = new MybatisUtils();
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int count = mapper.insertUser(new User(3,"王五","1234ty"));

        /*增删改的数据库操作需要提交事务*/
        sqlSession.commit();
        sqlSession.close();
        System.out.println(count);
    }


    @Test
    public void deleteUserById(){
        MybatisUtils mybatisUtils = new MybatisUtils();
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int count = mapper.deleteUserById(3);

        /*增删改的数据库操作需要提交事务*/
        sqlSession.commit();
        sqlSession.close();
        System.out.println(count);
    }

    @Test
    public void updateUser(){
        MybatisUtils mybatisUtils = new MybatisUtils();
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int count = mapper.updateUser(new User(3,"展示","1234ty"));

        /*增删改的数据库操作需要提交事务*/
        sqlSession.commit();
        sqlSession.close();
        System.out.println(count);
    }

    @Test
    public void updateUserMap(){
        MybatisUtils mybatisUtils = new MybatisUtils();
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String,Object> map = new HashMap<>();

        map.put("username","章法");
        // map.put("password","2334op");
        map.put("uid","3");

        int count = mapper.updateUserMap(map);

        /*增删改的数据库操作需要提交事务*/
        sqlSession.commit();
        sqlSession.close();
        System.out.println(count);
    }
}
