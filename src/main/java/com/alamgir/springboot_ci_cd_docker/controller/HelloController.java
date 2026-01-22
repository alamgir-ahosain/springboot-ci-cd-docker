package com.alamgir.springboot_ci_cd_docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alamgir.springboot_ci_cd_docker.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String showRegistrationForm() {
        return helloService.helloFunc();
    }

     @GetMapping("/index")
    public String index() {
        return "alamgir here";
    }

}
