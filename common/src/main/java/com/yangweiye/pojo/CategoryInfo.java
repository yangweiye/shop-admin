package com.yangweiye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "category_info")
public class CategoryInfo {
    private String categoryName;
    private Long parentId;
    private Integer level;
    private Integer sort;
    private Byte status;
}
