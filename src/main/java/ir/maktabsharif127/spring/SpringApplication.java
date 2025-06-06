package ir.maktabsharif127.spring;

import com.github.javafaker.Faker;
import ir.maktabsharif127.spring.service.CityService;
import ir.maktabsharif127.spring.service.Repository;
import ir.maktabsharif127.spring.service.Service;
import ir.maktabsharif127.spring.util.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@ComponentScan(basePackages = "ir.maktabsharif127.spring")
public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
//                "ir.maktabsharif127.spring"
                SpringApplication.class
        );
        Repository secondService = applicationContext.getBean(Repository.class);
        secondService.performLogic();
        Service firstService = applicationContext.getBean(Service.class);
        firstService.performLogic();
        TestService bean = applicationContext.getBean(TestService.class);
    }

    @Bean
    public Faker faker() {
        return new Faker();
    }

    @Bean
    public CityService cityService(Faker faker) {
        return new CityService(faker);
    }
}
