package com.kelvin.eshop.goods.repository;


import com.kelvin.eshop.goods.entity.Goods;
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
