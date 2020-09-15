package com.kelvin.eshop.order.entity;

import lombok.Data;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:31
 * @description:
 */
@Data
public class CartItem {


    private String id;
    private Integer qty;
    private String goodsSkuId;
    private String userId;

}
