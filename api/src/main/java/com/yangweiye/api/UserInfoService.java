package com.yangweiye.api;

import com.github.pagehelper.PageInfo;
import com.yangweiye.pojo.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> findAll();

    UserInfo findById(Long id);

    Integer insertUser(UserInfo user);

    Integer updateUser(UserInfo user);

    Integer deleteUserById(Integer id);

    PageInfo<UserInfo> getPageUserInfo(Integer pageNum, Integer pageSize);

    UserInfo findByUserName(String userName);
}
