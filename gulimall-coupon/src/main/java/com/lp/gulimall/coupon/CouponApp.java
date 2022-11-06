package com.lp.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CouponApp {

    public static void main(String[] args) {
        SpringApplication.run(CouponApp.class,args);
    }

}
