package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World 13abc";
    }

    @GetMapping("/api2")
    public String sayHello2(){
        return "Hello World 2";
    }

    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is your lucky day!" ;
    }
}
