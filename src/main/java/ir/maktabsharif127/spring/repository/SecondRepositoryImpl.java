package ir.maktabsharif127.spring.repository;

import org.springframework.stereotype.Repository;

@Repository(value = SecondRepositoryImpl.BEAN_NAME)
public class SecondRepositoryImpl implements BaseRepository {

    public static final String BEAN_NAME = "SecondRepositoryImpl";
}
