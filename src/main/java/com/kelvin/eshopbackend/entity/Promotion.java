package com.kelvin.eshopbackend.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:35
 * @description: 促销优惠
 */

@Data
@Entity
@Table
public class Promotion {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    private String id;

    @Column(length = 255)
    private String title;

    private Date startTime;
    private Date endTime;
    //TODO:
}
