package org.cloud.www.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("name-b")
public class NameBController {

    @GetMapping("hello-world")
    public String sayHello(){
        return "name-b say hello";
    }
}
