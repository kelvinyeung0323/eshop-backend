package com.kelvin.eshop.order.service;

import com.kelvin.eshop.order.dto.OrderDto;
import com.kelvin.eshop.order.dto.OrderQuery;
import com.kelvin.eshop.order.entity.Order;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:00
 * @description:
 */
public interface OrderService {
    List<Order> queryOrder(OrderQuery query);
    Order getOrder(String orderNo);
    Order placeOrder(OrderDto order);
    Boolean deleteOrder(String orderNo);
}
