package com.songsir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName com.songsir
 * @ProjectName nocas-consumer
 * @Auther: SongYapeng
 * @Date: Create in 8:08 2020/7/6
 * @Description:
 * @Copyright Copyright (c) 2020, songsir01@163.com All Rights Reserved.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerApp.class, args);
    }
}
