import com.wkx.dao.StudentMapper;
import com.wkx.pojo.Student;
import com.wkx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kaixuan.wang
 * @date 2021年07月19日 11:04
 */
public class test {

    @Test
    public void testIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        Map map = new HashMap();
        map.put("name","小明");

        List<Student> studentIf = mapper.getStudentIf(map);
        for (Student student : studentIf) {
            System.out.println(student);
        }
    }

    @Test
    public void testWhere(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        Map map = new HashMap();
        map.put("sex","男");

        List<Student> studentWhere = mapper.getStudentWhere(map);
        for (Student student : studentWhere) {
            System.out.println(student);
        }
    }

    @Test
    public void testChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Map map = new HashMap();
        List<Student> studentChoose = mapper.getStudentChoose(map);
        for (Student student : studentChoose) {
            System.out.println(student);
        }
    }

    @Test
    public void testSet(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Map map = new HashMap();
        map.put("name","李四");
        map.put("id",1);
        int studentSet = mapper.setStudentSet(map);
        System.out.println(studentSet);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void testSql(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Map map = new HashMap();
        map.put("sex","女");
        List<Student> studentSql = mapper.getStudentSql(map);
        for (Student student : studentSql) {
            System.out.println(student);
        }
    }

    @Test
    public void testForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        ArrayList<Integer> array = new ArrayList();
        array.add(1);
        array.add(2);
        HashMap<String,Object> map = new HashMap<>();
        map.put("ids",array);
        List<Student> studentForEach = mapper.getStudentForEach(map);
        for (Student student : studentForEach) {
            System.out.println(student);
        }
    }
}
