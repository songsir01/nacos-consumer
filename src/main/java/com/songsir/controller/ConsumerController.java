package com.songsir.controller;

import com.songsir.service.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName com.songsir.controller
 * @ProjectName nocas-consumer
 * @Auther: SongYapeng
 * @Date: Create in 9:44 2020/7/6
 * @Description:
 * @Copyright Copyright (c) 2020, songsir01@163.com All Rights Reserved.
 */
@RestController
public class ConsumerController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("testService")
    public String testService(String name) {

        return providerClient.helloWorld(name);
    }
}
