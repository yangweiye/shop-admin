package com.yangweiye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "user_info")
public class UserInfo extends BaseEntity {
    private String userName;
    private String userPassword;
    private String description;
    private Byte type;
    private Integer shopId;
}
