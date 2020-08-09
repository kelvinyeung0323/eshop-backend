package com.kelvin.eshopbackend.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:31
 * @description:
 */
@Data
@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @Column(length = 32)
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    private String id;
    private Integer qty;

    @OneToOne(fetch = FetchType.LAZY)
    private GoodsSku goodsSku;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

}
