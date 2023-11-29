package com.projects.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/Hello")
    public String HelloWorld(){
        return "Hello, World !!";
    }
}
