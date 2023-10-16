package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BusinessService;

@RestController
public class HelloController {

    @Autowired
    private final BusinessService bs;

    public HelloController(BusinessService bs) {
        this.bs = bs;
    }

    @GetMapping(value="/hello")
    public String sayHello() {
        return this.bs.getHelloWorld().toString();
    }

}
