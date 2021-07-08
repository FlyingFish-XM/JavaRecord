package com.wkx.test;

import com.wkx.dao.UserMapper;
import com.wkx.pojo.User;
import com.wkx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import java.util.List;


public class testLog4j {

    Logger logger = Logger.getLogger(testLog4j.class);


    @Test
    public void testSTDOU(){
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
    public void testLog4J(){


        MybatisUtils mybatisUtils = new MybatisUtils();
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> user = mapper.getUser();
        for (User user1 : user) {
            logger.info(user1);
        }

        sqlSession.close();


    }

}
