package com.wkx.TestItCarb;

import com.github.pagehelper.PageHelper;
import com.wkx.dao.UserMapper;
import com.wkx.pojo.User;
import com.wkx.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author kaixuan.wang
 * @date 2021年07月06日 12:48
 */
public class TestPageLimit {
    @Test
    public void testLimit(){

        MybatisUtils mybatisUtils = new MybatisUtils();
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 普通方式
        /*List<User> users = mapper.getUsers();*/

        // Map集合传参
        /*Map<String,Integer> map = new HashMap<>();
        map.put("pageStart",0);
        map.put("pageLimit",2);
        List<User> usersMap = mapper.getUsersMap(map);*/

        // 注解mybatis并且使用@Param
        User user = mapper.getUserById(1);
        System.out.println(user);

        /*for (User user : usersMap) {
            System.out.println(user);
        }*/

    }

    @Test
    public void getBounds(){

        RowBounds rowBounds = new RowBounds(0,2);

        MybatisUtils mybatisUtils = new MybatisUtils();
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getUserList(rowBounds);
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void testAnnoMybatis(){
        MybatisUtils mybatisUtils = new MybatisUtils();
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(5,"徐萌","vary pretty");
        // Integer integer = mapper.insertUser(user);
        // Integer integer = mapper.updateUser(user);
        Integer integer = mapper.deleteUser(5);

        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public void testPageHelper(){
        MybatisUtils mybatisUtils = new MybatisUtils();
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        PageHelper.startPage(1,2);
        mapper.getUser1();
    }
}
