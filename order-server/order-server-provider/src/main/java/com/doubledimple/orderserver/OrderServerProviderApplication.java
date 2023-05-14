package com.doubledimple.orderserver;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.doubledimple.orderserver.mapper")
@EnableDiscoveryClient
@EnableDubbo
@DubboComponentScan(basePackages = {"com.doubledimple.orderserverapi.service"})
public class OrderServerProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServerProviderApplication.class, args);
	}

}
