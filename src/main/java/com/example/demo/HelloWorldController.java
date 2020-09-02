package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //Controller -> Http isteklerini işleyeceği bir denetleyicidir.
public class HelloWorldController {

    //GET
    //URI -> /hello-world
    //method -> "Hello World"

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
}
