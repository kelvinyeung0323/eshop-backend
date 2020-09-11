package com.kelvin.eshopbackend.goodsservice.repository;

import com.kelvin.eshopbackend.base.repository.BaseRepository;
import com.kelvin.eshopbackend.base.entity.GoodsSku;
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
