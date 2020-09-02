package com.example.demo;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200") // FrontEnd sunucumuzdan gelen isteklere izin verdik.
@RestController //Controller -> Http isteklerini işleyeceği bir denetleyicidir.
public class HelloWorldController {

    //GET
    //URI -> /hello-world
    //method -> "Hello World"

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world") //2.yöntem ->> @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World";
    } //karşımıza normal string olarak çıkar.

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean"); //karşımıza json objesi şeklinde çıkar.
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean("Hello World "+name); //karşımıza json objesi şeklinde çıkar.
    }
}
