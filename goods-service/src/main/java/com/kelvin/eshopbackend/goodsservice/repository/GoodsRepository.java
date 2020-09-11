package com.kelvin.eshopbackend.goodsservice.repository;

import com.kelvin.eshopbackend.base.entity.Goods;
import com.kelvin.eshopbackend.base.repository.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:58
 * @description:
 */
@Repository
public interface GoodsRepository extends BaseRepository<Goods,String> {
}
