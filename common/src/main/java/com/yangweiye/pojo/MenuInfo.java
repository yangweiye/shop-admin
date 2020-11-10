package com.yangweiye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "menu_info")
public class MenuInfo extends BaseEntity {
    private Boolean iFrame;
    private String name;
    private Integer level;
    private String component;
    private Long pid;
    private Integer sort;
    private String icon;
    private String path;
    private Boolean cache;
    private Boolean hidden;
    private String componentName;
    private String permission;
    private List<MenuInfo> children;
}
