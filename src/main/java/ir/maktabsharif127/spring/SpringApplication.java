package ir.maktabsharif127.spring;

import ir.maktabsharif127.spring.service.FirstService;
import ir.maktabsharif127.spring.service.SecondService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        SecondService secondService = applicationContext.getBean(SecondService.class);
        secondService.performLogic();

        FirstService firstService = applicationContext.getBean(FirstService.class);
        firstService.performLogic();
    }
}
