package ir.maktabsharif127.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ir.maktabsharif127.spring")
@PropertySource(value = "classpath:application.properties")
public class AppConfig {
}
