package com.kelvin.eshop.goods.repository;

import com.kelvin.eshop.goods.entity.GoodsSku;
import com.kelvin.eshopbackend.base.repository.BaseRepository;
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
