package com.example.springcheck.controller;

import com.example.springcheck.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyController {

    private final TestService testService;

    public MyController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/val/{productName}")
    public String getValue(@PathVariable String productName){

            return testService.getProduct(productName).value();
    }
}
