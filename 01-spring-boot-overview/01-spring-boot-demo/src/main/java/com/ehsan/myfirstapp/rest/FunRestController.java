package com.ehsan.myfirstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose simple "/" to returne hello wrold

    @GetMapping("/")
    public String sayHello() {
        return "Dr Maryam";
    }


}
