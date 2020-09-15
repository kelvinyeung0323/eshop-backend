package com.kelvin.eshop.order.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:36
 * @description:
 */
@Data

public class OrderDetails {

    private String id;

    private String description;

    private String image;

    private String price;

    private String title;

    private String goodsSkuId;

    private Order order;

}
