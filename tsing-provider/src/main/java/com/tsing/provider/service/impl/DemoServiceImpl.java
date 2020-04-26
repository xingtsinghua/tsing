package com.tsing.provider.service.impl;

import com.tsing.service.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gaowenjin
 * @date 2020/4/26
 * @description:
 */
@Service
public class DemoServiceImpl implements DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public String sayHello(String name) {
        logger.info("provider sayHello {}", name);
        return "provider: " + name;
    }

}
