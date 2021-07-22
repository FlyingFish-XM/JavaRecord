import com.wkx.pojo.User;
import com.wkx.pojo.User1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kaixuan.wang
 * @date 2021年07月21日 11:12
 */
public class test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User1 user = (User1) applicationContext.getBean("user12");
        System.out.println(user.toString());
    }
}
