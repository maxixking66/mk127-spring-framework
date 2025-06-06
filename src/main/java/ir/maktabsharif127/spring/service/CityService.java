package ir.maktabsharif127.spring.service;

import com.github.javafaker.Faker;

//@Component
public class CityService {

    private final Faker faker;

    public CityService(Faker faker) {
        this.faker = faker;
    }
}
