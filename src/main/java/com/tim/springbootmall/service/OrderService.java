package com.tim.springbootmall.service;

import com.tim.springbootmall.dto.CreateOrderRequest;
import com.tim.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
