
import com.wkx.dao.StudentMapper;
import com.wkx.dao.TeacherMapper;
import com.wkx.pojo.Student;
import com.wkx.pojo.Teacher;
import com.wkx.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author kaixuan.wang
 * @date 2021年07月17日 13:03
 * 多对一，多个学生对应一个老师
 */

public class test {

    @Test
    public void testQueryTeacher(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher(2);
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1);
        }
        sqlSession.close();
    }

    @Test
    public void testQueryStudent(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }

    @Test
    public void testQueryStudent1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent1();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
}
