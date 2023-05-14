package com.doubledimple.orderserver.service.impl;

import com.doubledimple.orderserver.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public String getOrderId() {
        return "1233455";
    }
}
