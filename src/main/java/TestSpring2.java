import com.works.bryant.service.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring2 {
    public static void main(String[] args) {
        //初始化
        String path="classpath:spring-annotation.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        //获取map
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
