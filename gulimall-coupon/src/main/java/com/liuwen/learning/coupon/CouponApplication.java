package com.liuwen.learning.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.liuwen.learning.coupon.dao")
@SpringBootApplication
public class CouponApplication {


    public static void main(String[] args) {

        SpringApplication.run(CouponApplication.class, args);
    }
}
