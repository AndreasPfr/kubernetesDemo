package com.adidas.k8s.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by garcibor on 21/11/2017.
 */
@RestController
public class DemoController {

    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World!";
    }

}
