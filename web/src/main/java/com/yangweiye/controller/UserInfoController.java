package com.yangweiye.controller;

import com.yangweiye.api.UserInfoService;
import com.yangweiye.common.HttpResult;
import com.yangweiye.pojo.UserInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserInfoController {
    @Reference
    UserInfoService userInfoService;

    @GetMapping("/{id}")
    public HttpResult<?> findById(@PathVariable("id") Long id) {
        return HttpResult.success(userInfoService.findById(id));
    }
}
