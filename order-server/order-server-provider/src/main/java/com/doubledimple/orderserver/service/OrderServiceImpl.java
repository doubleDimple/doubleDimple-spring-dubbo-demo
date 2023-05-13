package com.doubledimple.orderserver.service;

import com.doubledimple.orderserverapi.service.OrderService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0")
public class OrderServiceImpl implements OrderService {

    @Override
    public String getOrderId() {
        return "1233455";
    }
}
