package com.tsing.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gaowenjin
 * @date 2020/4/26
 * @description:
 */
@SpringBootApplication
@EnableDubbo
public class TsingConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TsingConsumerApplication.class, args);
    }

}
