package com.kelvin.eshopbackend.entity;

import com.kelvin.eshopbackend.enums.OrderStatus;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:35
 * @description:
 */
@Data
@Entity
@Table(name = "user_order")
public class Order {

    @Id
    @GeneratedValue(generator="orderGenerator")
    @GenericGenerator(name="orderGenerator", strategy="com.kelvin.eshopbackend.common.idgenerator.OrderGenerator")
    @Column(length = 32)
    private String orderNo;
    @OneToOne(targetEntity = User.class)
    private User user;
    /** 收货人地址 **/
    @Column(length = 255)
    private String address;
    /** 收货人电话**/
    @Column(length = 16)
    private String phoneNo;

    /** 收货人 **/
    @Column(length = 64)
    private String consignee;
    /** 评价状态 **/
    private OrderStatus commentStatus;
    /** 运送状态 **/
    private OrderStatus shipStatus;

    /** 支付状态 **/
    private OrderStatus payStatus;
    /** 折扣 **/
    @Column(length = 16)
    private String discountAmt;
    /** 商品金额 **/
    @Column(length = 16)
    private String goodsAmt;

    /** 优惠券**/
    @Column(length = 16)
    private String couponAmt;

    /** 支付金额 **/
    @Column(length = 16)
    private String payAmt;

    /** 运费**/
    @Column(length = 16)
    private String shippingFee;
    /** 备注 **/
    @Column(length = 255)
    private String remark;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "order")
    private List<OrderDetails> orderDetails;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

}
