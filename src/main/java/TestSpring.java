import com.works.bryant.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //路径
        String path="classpath:spring-config.xml";
        //获取到路径加载到对象的东西
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        //返回值类型
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        System.out.println(userService);

    }
}
