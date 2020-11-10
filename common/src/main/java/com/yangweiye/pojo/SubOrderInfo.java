package com.yangweiye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;


@Data // getter、setter
@AllArgsConstructor // 全参构造方法
@NoArgsConstructor // 无参构造方法
@Accessors(chain = true) // 链式编程写法
@Table(name="sub_order_info")
public class SubOrderInfo extends BaseEntity{

    private Long orderId;

    private Long memberId;

    private Long shopId;

    private String shopName;

    private Date payTime;

    private BigDecimal payMoney;

    private String address;

    private BigDecimal expressfee;

    private Integer orderStatus;

    private Byte payStatus;

    private Byte payModel;

    private Byte exchangeType;
}
