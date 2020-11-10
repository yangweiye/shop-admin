package com.yangweiye.impl;

import com.yangweiye.api.TestApi;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TestService implements TestApi {
    @Override
    public String showTest() {
        return "实现showTest接口";
    }
}
