package com.zxc.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @RequestMapping(value = "/say")
    @ResponseBody
    public String doSome(){
        return "Hello Spring boot !!!";
    }

}
