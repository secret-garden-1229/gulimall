package com.lp.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MemberApp {

    public static void main(String[] args) {
        SpringApplication.run(MemberApp.class,args);
    }

}
