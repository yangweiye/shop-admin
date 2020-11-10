package com.yangweiye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Table;
import java.math.BigDecimal;

@Data // getter、setter
@AllArgsConstructor // 全参构造方法
@NoArgsConstructor // 无参构造方法
@Accessors(chain = true) // 链式编程写法
@Table(name = "goods_info")
public class GoodsInfo extends BaseEntity {


    private Long productId;

    private String goodsName;

    private String masterPic;

    private Integer shopId;

    private String shopName;

    private BigDecimal costPrice;

    private BigDecimal sellPrice;

    private Integer inventory;

    private Boolean isSpecification;

    private String specInfo;

    private Byte status;
}
