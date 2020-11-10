package com.yangweiye.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Table;

@Data // getter、setter
@AllArgsConstructor // 全参构造方法
@NoArgsConstructor // 无参构造方法
@Accessors(chain = true) // 链式编程写法
@Table(name = "goods_attach")
public class GoodsAttach extends BaseEntity {
    private Long goodsId;

    private String name;

    private Byte category;

    private Byte type;

    private String path;

    private String description;

    private Byte status;
}
