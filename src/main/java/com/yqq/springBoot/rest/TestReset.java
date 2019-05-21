package com.yqq.springBoot.rest;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("测试控制器")
@RequestMapping(value = "testRest")
public class TestReset  {

    @PostMapping
    public String test() {

        return "Hello word!";

    }

    @PutMapping(value = "{id}")
    public String putTest(@PathVariable String id) {


        return "Hello word!  path_params"+id;

    }

}
