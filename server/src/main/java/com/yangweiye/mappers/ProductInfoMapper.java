package com.yangweiye.mappers;


import com.yangweiye.mapper.BaseMapper;
import com.yangweiye.pojo.ProductInfo;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import tk.mybatis.mapper.provider.SpecialProvider;

public interface ProductInfoMapper extends BaseMapper<ProductInfo> {
}
