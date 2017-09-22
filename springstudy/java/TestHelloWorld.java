import com.oracle.HelloWorld;
import com.oracle.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yanliwei on 2017/7/25.
 */
public class TestHelloWorld {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld hw = (HelloWorld)context.getBean(HelloWorld.class);
        Student stu = new Student();
        stu.setStuname("夏侯蹲");

        hw.setStu(stu);
        hw.dayin();
    }
}
