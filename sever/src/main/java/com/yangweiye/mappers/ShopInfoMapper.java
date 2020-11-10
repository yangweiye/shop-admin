package com.yangweiye.mappers;

import com.yangweiye.mapper.BaseMapper;
import com.yangweiye.pojo.ShopInfo;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import tk.mybatis.mapper.provider.base.BaseInsertProvider;

public interface ShopInfoMapper extends BaseMapper<ShopInfo> {
}
