import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean_2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        Cat beanCat_2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat_2.getMessage());

        System.out.println("bean = bean_2 : " + (bean == bean_2));
        System.out.println("beanCat = beanCat_2 : " + (beanCat == beanCat_2));
    }
}