package org.cloud.www.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("say")
public class HelloController {

    @GetMapping("hello-world")
    public String sayHello(){
        return "server-b say hello";
    }
}
