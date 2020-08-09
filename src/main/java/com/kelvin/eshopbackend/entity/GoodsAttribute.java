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
@Table(name = "goods_attribute")
public class GoodsAttribute {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    private String id;
    @Column(length = 32)
    private String code;
    @Column(length = 32)
    private String  name;
    @Column(length = 255)
    private String itemNodes;
    @Column(length = 255)
    private String itemNames;

    @ManyToOne(targetEntity = Goods.class,fetch = FetchType.LAZY)
    private Goods goods;

}
