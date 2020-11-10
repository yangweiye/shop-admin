package com.yangweiye.controller;

import com.yangweiye.api.TestApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Reference
    TestApi testApi;

    @GetMapping("/showTest")
    public String showTest() {
        return testApi.showTest();
    }
}
