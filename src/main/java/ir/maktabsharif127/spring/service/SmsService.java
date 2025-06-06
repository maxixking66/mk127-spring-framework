package ir.maktabsharif127.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SmsService {

    //    SpEL
    @Value("${sms.username}")
    private String username;

    @Value("${sms.password:123456789}")
    private String password;

    @Value("${sms.api:/this-is-api}")
    private String api;

    public void sendSms(String message, String mobileNumber) {
        System.out.println(
                "sending " + message + " to " + mobileNumber + " - by username: " + username + ", password: " + password
                + ", api: " + api
        );
    }

}
