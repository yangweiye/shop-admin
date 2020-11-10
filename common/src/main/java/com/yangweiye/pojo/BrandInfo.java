package com.yangweiye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "brand_info")
public class BrandInfo extends BaseEntity {
    private String brandName;
    private String brandFirstLetter;
    private String brandLogo;
    private Integer status;
}
