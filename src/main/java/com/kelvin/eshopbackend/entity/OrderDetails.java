package com.kelvin.eshopbackend.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:36
 * @description:
 */
@Data
@Entity
@Table(name = "order_details")
public class OrderDetails {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    private String id;
    @Column(length = 1200)
    private String description;
    @Column(length = 1200)
    private String image;
    @Column(length = 16)
    private String price;
    @Column(length = 255)
    private String title;
    @OneToOne(fetch = FetchType.LAZY)
    private GoodsSku goodsSku;
    @ManyToOne(targetEntity = Order.class,fetch = FetchType.LAZY)
    private Order order ;

}
