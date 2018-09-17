package com.zat.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: Client1Application
 * @author: ZAT
 * @create: 2018-09-14 15:23
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class Client1Application {
    public static void main(String[] args) {
        SpringApplication.run(Client1Application.class, args);
    }
}