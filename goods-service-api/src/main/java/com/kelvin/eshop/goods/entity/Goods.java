package com.kelvin.eshop.goods.entity;

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
    @Column(length = 32)
    private String id;

    @Column(columnDefinition ="TEXT")
    private String intro;
    @Column(columnDefinition ="TEXT")
    private String questions;

    @OneToOne()
    private Category category;

    @OneToMany(mappedBy = "goods",fetch = FetchType.LAZY)
    private List<GoodsAttribute> goodsAttributes;

    @OneToMany(mappedBy = "goods",fetch = FetchType.LAZY)
    private List<GoodsSku> goodsSkus;
}
