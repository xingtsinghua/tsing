package com.tsing.consumer.web.controller;

import com.tsing.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaowenjin
 * @date 2020/4/26
 * @description:
 */
@RestController
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Reference
    private DemoService demoService;

    @GetMapping("sayHello")
    public String sayHello(String name) {
        logger.info("consumer sayHello: {}", name);
        return demoService.sayHello(name);
    }

}
