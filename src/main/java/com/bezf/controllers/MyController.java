package com.bezf.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {
    @GetMapping
    public String hello() {
        return "Hello, user!";
    }

    @GetMapping("read")
    public String read() {
        return "You have authority for reading";
    }

    @GetMapping("write")
    public String write() {
        return "You have authority for writing";
    }

    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, user!";
    }
}
