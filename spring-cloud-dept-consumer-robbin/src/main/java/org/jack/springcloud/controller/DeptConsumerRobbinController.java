package org.jack.springcloud.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author yangjie
 * @classname DeptControllerConsumer
 * @date 2020/03/31 0031 18:04:38
 * @description RestTemplate(Robbin)
 **/
@RestController
@RequestMapping("/deptRobbin")
public class DeptConsumerRobbinController {

    private Logger logger = Logger.getLogger(DeptConsumerRobbinController.class);

    private static final String REST_URL_PREFIX = "http://DEPT-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * RestTemplate(Robbin)方式调用Eureka注册的服务
     * @return
     */
    @RequestMapping("/findAll")
    public List findAll() {
        logger.info("deptRobbin:findAll:"+System.currentTimeMillis());
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/findAll", List.class);
    }

}
