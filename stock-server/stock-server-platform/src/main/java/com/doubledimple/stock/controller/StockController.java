package com.doubledimple.stock.controller;


import com.doubledimple.orderserverapi.service.OrderServiceApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {


    @DubboReference
    private OrderServiceApi orderServiceApi;


    @RequestMapping("/getOrder")
    public String getOrder(){
        return orderServiceApi.getOrderId();
    }
}
