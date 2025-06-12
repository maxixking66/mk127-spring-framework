package ir.maktabsharif127.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/")
    @ResponseBody
    public String getHome() {
        return "hello from home";
    }

    @GetMapping("/page")
    public String getPage() {
        return "page";
    }
}
