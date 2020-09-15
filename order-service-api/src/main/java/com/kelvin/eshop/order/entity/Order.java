package com.kelvin.eshop.order.entity;


import com.kelvin.eshopbackend.base.enums.OrderStatus;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:35
 * @description:
 */
@Data
public class Order {

    private String orderNo;
    private String userId;
    /** 收货人地址 **/

    private String address;
    /** 收货人电话**/

    private String phoneNo;

    /** 收货人 **/
    private String consignee;
    /** 评价状态 **/
    private OrderStatus commentStatus;
    /** 运送状态 **/
    private OrderStatus shipStatus;

    /** 支付状态 **/
    private OrderStatus payStatus;
    /** 折扣 **/

    private String discountAmt;
    /** 商品金额 **/

    private String goodsAmt;

    /** 优惠券**/

    private String couponAmt;

    /** 支付金额 **/

    private String payAmt;

    /** 运费**/

    private String shippingFee;
    /** 备注 **/

    private String remark;

    private List<OrderDetails> orderDetails;

    private Date createTime;

}
