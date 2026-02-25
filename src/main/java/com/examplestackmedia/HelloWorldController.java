package com.examplestackmedia;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //@Controller + @Responce body
public class HelloWorldController {

    // HTTP GET Request
    //http://localhost:8080/hello-world

    


    @GetMapping("/hello-world")

    public String helloWorld() {

        return "Hello world!";
    }
}
