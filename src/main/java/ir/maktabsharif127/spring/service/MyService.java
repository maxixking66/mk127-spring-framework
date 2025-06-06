package ir.maktabsharif127.spring.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyRepository repository;

    private final CityService cityService;

    public MyService(MyRepository repository, CityService cityService) {
        this.repository = repository;
        this.cityService = cityService;
    }

    public void performLogic() {
        System.out.println("in perform logic method in first service");
        repository.performLogic();
    }
}
