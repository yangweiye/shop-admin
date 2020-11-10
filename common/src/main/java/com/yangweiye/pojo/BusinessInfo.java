package com.yangweiye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "business_info")
public class BusinessInfo extends BaseEntity {
    private Long defaultShopId;

    private String defaultShopName;

    private Integer status;

    private String phone;

    private String email;

    private String compName;

    private String compMobile;

    private String compPhone;

    private String compAddress;

    private String conName;

    private String conQq;

    private String conMobile;

    private String conEmail;

    private String licenseNum;

    private String taxregistNum;

    private String organNum;

    private String legal;

    private String legalIndentity;

    private String openbank;

    private String obBranch;

    private String bankNum;
}
