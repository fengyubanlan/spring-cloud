package org.jack.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"org.jack.springcloud"})
@EnableEurekaClient
public class DeptConsumerFeignApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeignApp.class, args);
    }

}
