package com.kelvin.eshop.order.service.impl;

import com.kelvin.eshop.order.dto.OrderDto;
import com.kelvin.eshop.order.dto.OrderQuery;
import com.kelvin.eshop.order.entity.Order;
import com.kelvin.eshop.order.repository.OrderRepository;
import com.kelvin.eshop.order.service.OrderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DubboService
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> queryOrder(OrderQuery query) {
        Order order = new Order();
        order.setConsignee("abc");
        orderRepository.save(order);
        return Arrays.asList(order);
    }

    @Override
    public Order getOrder(String orderNo) {
        return null;
    }

    @Override
    public Order placeOrder(OrderDto order) {
        return null;
    }

    @Override
    public Boolean deleteOrder(String orderNo) {
        return null;
    }
}
