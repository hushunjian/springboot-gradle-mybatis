package com.hushunjian.gradle.mybatis.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hushunjian
 */
@RequestMapping("hello")
@RestController(value = "hello")
public class HelloController extends BaseController {

    @ResponseBody
    @GetMapping("sayHello")
    @ApiOperation(value = "sayHello")
    public String sayHello(){
        return "hello_world!";
    }

}
