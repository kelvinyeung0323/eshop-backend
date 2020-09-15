package com.kelvin.eshop.goods.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:32
 * @description:
 */
@Data
@Entity
@Table(name = "coupon")
public class Coupon {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    @Column(length = 32)
    private String id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    private Date startDate;
    @Column(length = 255)
    private String scope;

    @Column(length = 255)
    private String title;
}
