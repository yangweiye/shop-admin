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
@Table(name="order_item")
public class OrderItem extends BaseEntity{


    private Long subOrderId;

    private Long goodsId;

    private String goodsName;

    private String goodsSpec;

    private BigDecimal sellPrice;

    private BigDecimal actualPayment;

    private Integer quantity;

    private Integer discountType;

    private Byte payStatus;

    private Byte itemStatus;
}
