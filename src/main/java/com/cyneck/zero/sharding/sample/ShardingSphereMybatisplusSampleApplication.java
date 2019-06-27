package com.cyneck.zero.sharding.sample;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class ShardingSphereMybatisplusSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereMybatisplusSampleApplication.class, args);
    }

}
