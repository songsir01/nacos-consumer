package com.songsir.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @PackageName com.songsir.service
 * @ProjectName nocas-consumer
 * @Auther: SongYapeng
 * @Date: Create in 9:40 2020/7/6
 * @Description:
 * @Copyright Copyright (c) 2020, songsir01@163.com All Rights Reserved.
 */
@FeignClient("nacos-provider")
public interface ProviderClient {

    @GetMapping("/helloWorld")
    String helloWorld(@RequestParam(value = "name", defaultValue = "songsir", required = false) String name);

}
