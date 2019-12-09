package com.laomukuq;

import cc.moecraft.icq.PicqBotX;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author laomu
 * @date 2019-12-07
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(value = "com.laomukuq.mapper")
public class LaomukuqLifeServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LaomukuqLifeServiceApplication.class, args);
    }

    @Bean
    public PicqBotX initBot(){
        return new PicqBotX(0);
    }
}
