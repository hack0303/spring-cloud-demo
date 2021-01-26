package org.cloud.www.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("talk")
public class ReqController {

    @GetMapping("me")
    public String sayHello(@RequestParam("nav") String nav){
         System.out.println(nav);
         return "success";
    }
}
