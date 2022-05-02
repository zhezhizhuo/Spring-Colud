package com.qgj.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 屈高杰
 */
@RestController
public class TestController {


    @RequestMapping("/index")
    public String hello(){

        return "hello Cloud";
    }
}
