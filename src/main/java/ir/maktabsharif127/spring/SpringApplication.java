package ir.maktabsharif127.spring;

import ir.maktabsharif127.spring.service.FirstService;
import ir.maktabsharif127.spring.service.SecondService;
import ir.maktabsharif127.spring.service.ThirdService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "ir.maktabsharif127.spring"
        );

        SecondService secondService = applicationContext.getBean(SecondService.class);
        secondService.performLogic();

        FirstService firstService = applicationContext.getBean(FirstService.class);
        firstService.performLogic();

        ThirdService bean = applicationContext.getBean(ThirdService.class);

    }
}
