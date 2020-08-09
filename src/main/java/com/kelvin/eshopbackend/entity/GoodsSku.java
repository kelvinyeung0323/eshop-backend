package com.kelvin.eshopbackend.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:33
 * @description:
 */
@Data
@Entity
@Table(name = "goods_sku")
public class GoodsSku {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    private String id;
    @Column(length = 255)
    private String attrPath;
    @Column(length = 1200)
    private String bannerImages;
    @Column(length = 255)
    private String description;
    @Column(length = 16)
    private String price;

    private Integer salesVolume;
    //规格参数
    @Column(length = 255)
    private String specs;
    //库存
    private Integer stock;
    @Column(length = 255)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    private Goods goods;
}
