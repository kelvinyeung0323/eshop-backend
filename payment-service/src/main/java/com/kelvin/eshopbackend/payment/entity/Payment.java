package com.kelvin.eshopbackend.payment.entity;

import com.kelvin.eshopbackend.base.enums.OrderStatus;
import com.kelvin.eshopbackend.base.enums.PayType;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:35
 * @description:
 */

@Data
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    @Column(length = 32)
    private String id;
    @Column(length = 16)
    private String amount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date  payTime;
    private PayType payType;
    private OrderStatus payStatus;

    @Column(length = 32)
    private String userId;
}
