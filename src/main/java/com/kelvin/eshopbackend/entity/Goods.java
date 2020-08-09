package com.kelvin.eshopbackend.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:33
 * @description:
 */
@Data
@Entity
@Table(name = "goods")
public class Goods {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    private String id;

    @Column(length = 1200)
    private String introImages;
    @Column(length = 1200)
    private String questions;

    @OneToOne()
    private Category category;

    @OneToMany(mappedBy = "goods",fetch = FetchType.LAZY)
    private List<GoodsAttribute> goodsAttributes;

    @OneToMany(mappedBy = "goods",fetch = FetchType.LAZY)
    private List<GoodsSku> goodsSkus;
}
