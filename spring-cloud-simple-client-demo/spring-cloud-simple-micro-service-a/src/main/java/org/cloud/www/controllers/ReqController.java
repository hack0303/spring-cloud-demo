package org.cloud.www.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("talk")
public class ReqController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("me")
    public String sayHello(@RequestParam("nav") String nav){
         System.out.println(nav);
         return restTemplate.getForObject("http://micro-service-b/talk/me?nav={1}",String.class,nav);
    }
}
