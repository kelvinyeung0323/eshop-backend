package com.kelvin.eshopbackend.base.service;

import com.kelvin.eshopbackend.base.entity.GoodsAttribute;
import com.kelvin.eshopbackend.base.entity.GoodsSku;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:00
 * @description:
 */
public interface GoodsService {

    GoodsSku getGoodsByAttribute(String goodsId, String goodSku, String attrs);
    List<GoodsAttribute> getGoodsAttribute(String goodsId);

    List<GoodsSku> getGoodsSkusByGoodsId(String goodsId);
}
