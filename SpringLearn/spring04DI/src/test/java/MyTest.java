import com.wkx.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kaixuan.wang
 * @date 2021年07月21日 18:53
 */
public class MyTest {

    @Test
    public void testByName(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
    @Test
    public void testByType(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = applicationContext.getBean("user1", User.class);
        System.out.println(user1);
    }

}
