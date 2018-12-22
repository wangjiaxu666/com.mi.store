package com.mi.store.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class Test {

    @RequestMapping(value = "/test")
    public String test(){
        return "你好，spring boot项目！111";
    }
}
