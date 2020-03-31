package org.jack.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yangjie
 * @classname ConfigBean
 * @date 2020/03/31 0031 23:11:23
 * @description
 **/
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
