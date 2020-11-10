package com.yangweiye.impl;

import com.github.pagehelper.PageInfo;
import com.yangweiye.api.UserInfoService;
import com.yangweiye.mappers.UserInfoMapper;
import com.yangweiye.pojo.UserInfo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return null;
    }

    @Override
    public UserInfo findById(Integer id) {
        return null;
    }

    @Override
    public Integer insertUser(UserInfo user) {
        return null;
    }

    @Override
    public Integer updateUser(UserInfo user) {
        return null;
    }

    @Override
    public Integer deleteUserById(Integer id) {
        return null;
    }

    @Override
    public PageInfo<UserInfo> getPageUserInfo(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public UserInfo findByUserName(String userName) {
        return null;
    }
}
