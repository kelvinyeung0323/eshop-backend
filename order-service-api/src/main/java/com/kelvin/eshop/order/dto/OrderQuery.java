package com.kelvin.eshop.order.dto;

import com.kelvin.eshopbackend.base.enums.OrderStatus;
import lombok.Data;

@Data
public class OrderQuery {
    private String userNo;
    private OrderStatus orderStatus;
}
