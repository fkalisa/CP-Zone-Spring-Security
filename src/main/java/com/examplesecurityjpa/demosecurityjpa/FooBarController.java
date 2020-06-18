package com.examplesecurityjpa.demosecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooBarController {
    // this require auth and authorization
    @GetMapping("/student")
    public String getStudent(){
        return "Hello student";
    }

    // this require auth and authorization
    @GetMapping("/admin")
    public String getAdmin(){
        return "Hello admin";
    }

    // visitor does not need to authenticate and authorization
    // available to general public
    @GetMapping("/visitor")
    public String getVisitor(){
        return "Hello visitor";
    }
}
