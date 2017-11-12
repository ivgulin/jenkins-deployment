package com.mokujin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello(){
        System.out.println("Hello world!!!");
        return "Hello World1!!";
    }
}
