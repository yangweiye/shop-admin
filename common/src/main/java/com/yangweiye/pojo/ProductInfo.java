package com.yangweiye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Table;
import java.util.List;

@Data // getter、setter
@AllArgsConstructor // 全参构造方法
@NoArgsConstructor // 无参构造方法
@Accessors(chain = true) // 链式编程写法
@Table(name="product_info")
public class ProductInfo extends BaseEntity{


    private String productName;

    private Integer shopId;

    private Integer classify1;

    private Integer classify2;

    private Integer classify3;

    private String template;

    private String brand;

    private String subtitle;

    private String packlist;

    private String afterservice;

    private String status;

    private List<GoodsInfo> goodsList;

}
