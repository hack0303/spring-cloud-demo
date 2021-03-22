package org.cloud.www.controllers;

import org.cloud.www.rpc.HelloRpcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("a")
public class ContextAController {


    @GetMapping("")
    public String test() {
        return "a";
    }
}
