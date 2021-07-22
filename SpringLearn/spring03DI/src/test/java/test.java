import com.wkx.pojo.Student;
import com.wkx.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kaixuan.wang
 * @date 2021年07月21日 15:35
 */
public class test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentData = (Student)applicationContext.getBean("student");
        System.out.println(studentData.toString());
    }

    @Test
    public void testDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User userData = applicationContext.getBean("user",User.class);
        System.out.println(userData.toString());
    }

    @Test
    public void testDISingleton(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = applicationContext.getBean("user3",User.class);
        User user1 = applicationContext.getBean("user3",User.class);
        System.out.println(user==user1);
    }


}
