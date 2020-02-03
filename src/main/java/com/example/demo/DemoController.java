package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @GetMapping
    public String hello() {
        return "Hello";
    }

}