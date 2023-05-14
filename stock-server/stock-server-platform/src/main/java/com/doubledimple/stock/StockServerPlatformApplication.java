package com.doubledimple.stock;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.doubledimple.stock.mapper")
public class StockServerPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockServerPlatformApplication.class, args);
    }

}
