package org.jack.springcloud.controller;

import org.apache.log4j.Logger;
import org.jack.springcloud.entity.Dept;
import org.jack.springcloud.feign.DeptRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangjie
 * @classname DeptConsumerFeignController
 * @date 2020/03/31 0031 23:56:58
 * @description
 **/
@RestController
@RequestMapping("/deptFeign")
public class DeptConsumerFeignController {

    private Logger logger = Logger.getLogger(DeptConsumerFeignController.class);

    @Autowired
    private DeptRemote deptRemote;

    @RequestMapping("/findAll")
    public List<Dept> findAll(){
        logger.info("deptFeign:findAll:"+System.currentTimeMillis());
        return deptRemote.findAll();
    }

}
