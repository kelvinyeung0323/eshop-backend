package com.kelvin.eshop.order.dto;

import com.kelvin.eshopbackend.base.enums.OrderStatus;
import lombok.Data;

import java.io.Serializable;

@Data
public class OrderQuery implements Serializable {
    private String userNo;
    private OrderStatus orderStatus;
}
