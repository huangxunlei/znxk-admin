package com.znxk.admin.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
* @author huangxunlei
* @time 2022/3/18 11:34
*/
@SpringBootApplication
@EnableDiscoveryClient
public class AdminMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminMainApplication.class);
    }
}
