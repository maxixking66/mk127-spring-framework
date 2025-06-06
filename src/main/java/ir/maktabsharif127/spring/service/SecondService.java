package ir.maktabsharif127.spring.service;

import org.springframework.stereotype.Component;

@Component
public class SecondService {

    public SecondService() {
        System.out.println("in second service constructor");
    }

    public void performLogic() {
        System.out.println("in perform logic method in second service");
    }
}
