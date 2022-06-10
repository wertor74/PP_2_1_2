import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1);
        Cat bean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean2);
        Cat bean3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean3);
        boolean compareBean = bean == bean1;
        System.out.println(compareBean);
        compareBean = bean2 == bean3;
        System.out.println(compareBean);
    }
}