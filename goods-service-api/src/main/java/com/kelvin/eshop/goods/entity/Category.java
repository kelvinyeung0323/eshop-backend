package com.kelvin.eshop.goods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:32
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    private String id;
    /**
     * 如果是一级类目，点banner可以跳转到指定页面
     **/
    private String url;

    private String code;

    private String icon;

    private String name;

    //排序
    private int seq;

    //层级
    private int lvl;

    private Boolean enabled;

    private Category parent;
    private List<Category> subCategories;

}
