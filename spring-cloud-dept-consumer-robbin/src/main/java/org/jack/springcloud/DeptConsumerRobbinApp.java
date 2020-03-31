package org.jack.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 11329
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class DeptConsumerRobbinApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerRobbinApp.class, args);
    }

}
