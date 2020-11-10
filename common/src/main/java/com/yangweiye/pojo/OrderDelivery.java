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
@Table(name="order_delivery")
public class OrderDelivery extends BaseEntity{


    private Long subOrderId;

    private String reciveName;

    private Integer reciveProvince;

    private Integer reciveCity;

    private Integer reciveArea;

    private String reciveAddress;

    private String reciveMobile;

    private String reciveEmail;

    private String postId;

    private Byte postStatus;

    private BigDecimal postFee;

    private Date postTime;

    private Date deliveryTime;

    private Byte status;
}
