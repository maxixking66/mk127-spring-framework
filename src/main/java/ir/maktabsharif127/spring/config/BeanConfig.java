package ir.maktabsharif127.spring.config;

import com.github.javafaker.Faker;
import ir.maktabsharif127.spring.service.CityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Faker faker() {
        return new Faker();
    }

//    @Bean
//    public CityService cityService() {
//        return new CityService(faker());
//    }

    @Bean
    public CityService cityService(Faker faker) {
        return new CityService(faker);
    }

}
