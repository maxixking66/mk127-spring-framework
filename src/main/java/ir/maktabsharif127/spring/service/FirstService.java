package ir.maktabsharif127.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstService {

    private SecondService secondService;

    @Autowired
    public void setSecondService(SecondService secondService) {
        this.secondService = secondService;
    }

    public void performLogic() {
        System.out.println("in perform logic method in first service");
        secondService.performLogic();
    }
}
