package com.tim.springbootmall.service;

import com.tim.springbootmall.dto.CreateOrderRequest;
import com.tim.springbootmall.dto.OrderQueryParams;
import com.tim.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
