package com.yangweiye.mapper;

import com.yangweiye.pojo.BaseEntity;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface BaseMapper<T extends BaseEntity> extends Mapper<T>, MySqlMapper<T> {
}
