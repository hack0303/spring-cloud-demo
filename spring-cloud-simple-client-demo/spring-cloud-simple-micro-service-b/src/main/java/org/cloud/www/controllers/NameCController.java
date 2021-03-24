package org.cloud.www.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("name-c")
public class NameCController {

    @GetMapping("hello-world")
    public String sayHello(){
        return "name-c say hello";
    }
}
