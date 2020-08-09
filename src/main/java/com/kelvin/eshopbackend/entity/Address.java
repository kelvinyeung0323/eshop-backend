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
@Entity(name = "address")
public class Address {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    private String id;
    @Column(length = 32)
    private String consignee;

    @Column(length = 255)
    private String detailAddr;

    @Column(name = "is_default")
    private boolean isDefault;

    @Column(length = 16)
    private String phoneNo;

    @OneToOne(targetEntity = User.class,fetch = FetchType.LAZY)
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    private Area area;

}
