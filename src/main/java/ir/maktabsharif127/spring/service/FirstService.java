package ir.maktabsharif127.spring.service;

public class FirstService {

    private String name;

    private SecondService secondService;

    public FirstService(SecondService secondService) {
        System.out.println("in first service constructor");
        this.secondService = secondService;
    }

    public void performLogic() {
        System.out.println("in perform logic method in first service name is: " + name);
        secondService.performLogic();
    }

    public void setName(String name) {
        this.name = name;
    }
}
