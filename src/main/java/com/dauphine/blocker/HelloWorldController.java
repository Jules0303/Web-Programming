package com.dauphine.blocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {

    @GetMapping("/hello world")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloName(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/hello")
    public String sayHelloName2(@RequestParam String name) {
        return "Hello " + name;
    }
}
