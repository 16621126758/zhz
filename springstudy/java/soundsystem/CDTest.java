package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yanliwei on 2017/7/25.
 */
public class CDTest {
    public static void main(String[] args) {
        //ApplicationContext ax = new ClassPathXmlApplicationContext("configs/applicationContext-wired.xml");
        AnnotationConfigApplicationContext
                context =
                new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.play();
    }
}
