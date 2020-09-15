package com.kelvin.eshop.order.repository;

import com.kelvin.eshopbackend.base.repository.BaseRepository;
import com.kelvin.eshop.order.entity.Order;
import org.springframework.stereotype.Repository;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:57
 * @description:
 */
@Repository
public interface OrderRepository extends BaseRepository<Order,String> {
}
