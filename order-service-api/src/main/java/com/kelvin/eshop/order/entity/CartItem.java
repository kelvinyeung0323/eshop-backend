package com.kelvin.eshop.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:31
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem implements Serializable {


    private String id;
    private Integer qty;
    private String goodsSkuId;
    private String userId;

}
