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
@Table(name="template_info")
public class TemplateInfo extends BaseEntity{
    private Integer categoryId;

    private String templateName;

    private String brands;

    private String specs;

    private String attribute;

    private Integer status;
}
