package com.kelvin.eshop.goods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/9 16:33
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {

    private String id;
    private String intro;
    private String questions;
    private Category category;
    private List<GoodsAttribute> goodsAttributes;
    private List<GoodsSku> goodsSkus;
}
