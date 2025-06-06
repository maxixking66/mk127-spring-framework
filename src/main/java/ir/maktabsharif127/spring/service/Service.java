package ir.maktabsharif127.spring.service;

import org.springframework.stereotype.Component;

@Component
public class Service {

    private final Repository repository;

    private final CityService cityService;

    public Service(Repository repository, CityService cityService) {
        this.repository = repository;
        this.cityService = cityService;
    }

    public void performLogic() {
        System.out.println("in perform logic method in first service");
        repository.performLogic();
    }
}
