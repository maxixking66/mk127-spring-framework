package ir.maktabsharif127.spring;

import ir.maktabsharif127.spring.service.SmsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan
@PropertySource(value = "classpath:application.properties")
public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringApplication.class
        );
        Environment environment = applicationContext.getBean(Environment.class);
        System.out.println(environment.getProperty("sms.username"));
        applicationContext.getBean(SmsService.class)
                .sendSms("hi", "09375555555");
    }
}
