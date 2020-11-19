package com.fh.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("demo")
@RestController
public class TestController {

    @RequestMapping("test")
    public String test(){
        return "啊啊啊!!! 出来了!!!出来了";
    }
}
