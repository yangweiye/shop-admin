package com.yangweiye.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangweiye.api.UserInfoService;
import com.yangweiye.mappers.UserInfoMapper;
import com.yangweiye.pojo.UserInfo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public UserInfo findById(Long id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer insertUser(UserInfo user) {
        //selective 如果字段为空就不进行添加或修改
        return userInfoMapper.insertSelective(user);
    }

    @Override
    public Integer updateUser(UserInfo user) {
        return userInfoMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public Integer deleteUserById(Integer id) {
        return userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<UserInfo> getPageUserInfo(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserInfo> userList = userInfoMapper.selectAll();
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userList);

        return pageInfo;
    }

    @Override
    public UserInfo findByUserName(String userName) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("userName", userName);
        UserInfo userInfo = userInfoMapper.selectOneByExample(example);

        return userInfo;
    }
}
