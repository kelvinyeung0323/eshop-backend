package com.kelvin.eshop.goods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:33
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsSku {


    private String id;
    /**
     * 存储为key1:value1,key2:value2
     * key为属性分类
     * value为属性代码
     * **/
    private String attributes;

    private String bannerImages;

    private String description;

    private String price;

    private Integer salesVolume;
    //规格参数
    private String specs;
    //库存
    private Integer stock;
    private String title;

    private Goods goods;
}
