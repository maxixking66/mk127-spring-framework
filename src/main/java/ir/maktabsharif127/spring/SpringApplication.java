package ir.maktabsharif127.spring;

import ir.maktabsharif127.spring.service.Repository;
import ir.maktabsharif127.spring.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "ir.maktabsharif127.spring"
        );

        Repository secondService = applicationContext.getBean(Repository.class);
        secondService.performLogic();

        Service firstService = applicationContext.getBean(Service.class);
        firstService.performLogic();

    }
}
