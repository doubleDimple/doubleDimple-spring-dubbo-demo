package com.doubledimple.orderserver.service.route;

import com.doubledimple.orderserver.service.OrderService;
import com.doubledimple.orderserverapi.service.OrderServiceApi;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
public class OrderServiceRoute implements OrderServiceApi {

    @Autowired
    private OrderService orderService;

    @Override
    public String getOrderId() {
        return orderService.getOrderId();
    }
}
