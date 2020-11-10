package com.yangweiye.impl;

import com.github.pagehelper.PageInfo;
import com.yangweiye.api.UserInfoService;
import com.yangweiye.pojo.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserInfoServiceTest {
    @Autowired
    UserInfoService userInfoService;

    @Test
    public void pageTest(){
        PageInfo<UserInfo> pageUserInfo = userInfoService.getPageUserInfo(1,2);
        System.out.println(pageUserInfo);
    }

}
