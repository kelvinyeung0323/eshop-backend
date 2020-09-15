package com.kelvin.eshop.goods.repository;

import com.kelvin.eshop.goods.entity.GoodsAttribute;
import com.kelvin.eshopbackend.base.repository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:59
 * @description:
 */
@Repository
public interface GoodsAttributeRepository extends BaseRepository<GoodsAttribute,String> {

    List<GoodsAttribute> findAllByGoodsId(String goodsId);
}
