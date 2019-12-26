package com.yqq.rest;

import com.yqq.event.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("EnventDemoRest/")
public class EnventDemoRest {

    @Autowired
    EventPublisher eventPublisher;

    @RequestMapping("test")
    public String test() {
        eventPublisher.nodify();
        return "success";
    }

}
