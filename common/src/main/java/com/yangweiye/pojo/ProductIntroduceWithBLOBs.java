package com.yangweiye.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data // getter、setter
@AllArgsConstructor // 全参构造方法
@NoArgsConstructor // 无参构造方法
@Accessors(chain = true) // 链式编程写法
public class ProductIntroduceWithBLOBs extends ProductIntroduce {
    private String introduce;
    private String extrattribute;
}
