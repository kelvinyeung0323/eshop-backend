package com.kelvin.eshopbackend.repository;

import com.kelvin.eshopbackend.entity.GoodsSku;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:59
 * @description:
 */
@Repository
public interface GoodsSkuRepository extends BaseRepository<GoodsSku,String> {

    List<GoodsSku> findAllByGoodsId(String goodsId);
}
