import com.wkx.dao.TeacherMapper;
import com.wkx.pojo.Teacher;
import com.wkx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author kaixuan.wang
 * @date 2021年07月17日 17:28
 */
public class test {

    @Test
    public void queryTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher(1);
        System.out.println(teacher);

    }


}
