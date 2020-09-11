package com.kelvin.eshopbackend.payment.entity;

import com.kelvin.eshopbackend.base.enums.OrderStatus;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:34
 * @description:
 */

@Data
@Entity
@Table(name = "pay_record")
public class PayRecord {

    @Id
    @GeneratedValue(generator="sys_uid")
    @GenericGenerator(name="sys_uid", strategy="uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "notice")
    private String notice;
    private String payRequest;

    private String payResponse;

    private String payType;

    private OrderStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private String userId;
    @Column(length = 32)
    private String orderId;
}
