import com.wkx.dao.UserMapper;
import com.wkx.pojo.User;
import com.wkx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author kaixuan.wang
 * @date 2021年07月19日 18:59
 */
public class test {

    @Test
    public void testFirstCache(){
        // SqlSession中存在一级缓存，不需要手动开启
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUserCache();
        for (User user : users) {
            System.out.println(user);
        }

        // 查询统一个信息，直接从一级缓存中拿出数据，不需要再次创建连接池
        List<User> userCache = mapper.getUserCache();
        for (User user : userCache) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testSecondCache(){
        // 二级缓存需要手动开区
        // 第一步：在mybatis的配置文件中的setting标签中设置开启缓存
        // 第二步：在xml文件中添加cache标签
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users= mapper.getUserCache();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();

        // 开启二级缓存后，在一级缓存(SqlSession)关闭后，会将数据放到二级缓存，查询相同的内容时，从二级缓存拿数据
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        List<User> userCache = mapper1.getUserCache();
        for (User user : userCache) {
            System.out.println(user);
        }
    }

}
