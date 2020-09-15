package com.kelvin.eshop.order.service;

import com.kelvin.eshop.order.entity.CartItem;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 15:00
 * @description:
 */
public interface CartService {

    List<CartItem> addToCart(CartItem cartItem);
}
