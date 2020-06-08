package com.woniu.yoga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bai
 * @create 2020-06-09-上午 12:08
 */

@RestController
public class TestController {
    @GetMapping("say")
    public String say(){
        System.out.println("say");
        System.out.println("init");
        return "hello";
    }
}
