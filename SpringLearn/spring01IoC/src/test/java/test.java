import com.wkx.Service.DoctorService;
import com.wkx.Service.DoctorServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kaixuan.wang
 * @date 2021年07月20日 16:10
 */
public class test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        DoctorServiceImpl eat = (DoctorServiceImpl) classPathXmlApplicationContext.getBean("eat2");
        eat.eat();

    }

}