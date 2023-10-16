package service;

import model.HelloWorld;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    public HelloWorld getHelloWorld() {
        HelloWorld hw = new HelloWorld();
        return hw;
    }
}
