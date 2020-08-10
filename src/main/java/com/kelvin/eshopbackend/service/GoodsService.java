package com.kelvin.eshopbackend.service;

import com.kelvin.eshopbackend.entity.GoodsAttribute;
import com.kelvin.eshopbackend.entity.GoodsSku;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:00
 * @description:
 */
public interface GoodsService {

    GoodsSku getGoodsByAttribute(String goodsId,String goodSku,String attrs);
    List<GoodsAttribute> getGoodsAttribute(String goodsId);

    List<GoodsSku> getGoodsSkusByGoodsId(String goodsId);
}
