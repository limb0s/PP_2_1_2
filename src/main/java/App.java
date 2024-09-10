import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat bean2 = applicationContext.getBean("cat", Cat.class);
        Cat bean3 = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean.equals(bean1));
        System.out.println(bean2.equals(bean3));
        System.out.println(bean.getMessage());
    }
}