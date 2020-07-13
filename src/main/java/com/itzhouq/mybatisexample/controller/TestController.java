package com.itzhouq.mybatisexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: for test
 * @Author: itzhouq
 * @Date: 2020/7/12 13:22
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "Hello Spring Boot ~";
    }
}
