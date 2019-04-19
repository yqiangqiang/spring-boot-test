package com.yqq.springmvc.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControler {

    @RequestMapping(value = "/test.do")
    public String test() {
        return "test";
    }

}
