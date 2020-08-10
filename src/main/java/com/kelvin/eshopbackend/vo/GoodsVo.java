package com.kelvin.eshopbackend.vo;

import lombok.Data;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:43
 * @description:
 */
@Data
public class GoodsVo {

    private String goodsId;
    private String goodsSkuId;
    private String title;
    private String images;
    private String price;
    private String description;
}
