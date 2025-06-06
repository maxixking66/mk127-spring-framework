package ir.maktabsharif127.spring.service;

import ir.maktabsharif127.spring.repository.BaseRepository;
import ir.maktabsharif127.spring.repository.SecondRepositoryImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final BaseRepository repository;

    public MyService(@Qualifier(SecondRepositoryImpl.BEAN_NAME) BaseRepository repository) {
        this.repository = repository;
    }

    public void performLogic() {
        System.out.println("in perform logic method in first service");
    }
}
