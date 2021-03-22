package org.cloud.www.controllers;

import org.cloud.www.rpc.HelloRpcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("say")
public class HelloController {

    @Resource
    HelloRpcService helloRpcService;

    @GetMapping("hello-world")
    public String sayHelloWorld() {
        return helloRpcService.sayHello();
    }
}
