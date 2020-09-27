package com.kelvin.eshop.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:36
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails implements Serializable {

    private String id;

    private String description;

    private String image;

    private String price;

    private String title;

    private String goodsSkuId;

    private Order order;

}
