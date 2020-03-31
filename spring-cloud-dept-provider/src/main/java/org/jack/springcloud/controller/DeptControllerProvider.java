package org.jack.springcloud.controller;

import org.apache.log4j.Logger;
import org.jack.springcloud.entity.Dept;
import org.jack.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangjie
 * @classname DeptController
 * @date 2020/03/31 0031 12:20:01
 * @description
 **/
@RestController
@RequestMapping("/dept")
public class DeptControllerProvider {

    private Logger logger = Logger.getLogger(DeptControllerProvider.class);

    @Autowired
    private DeptService deptService;

    @RequestMapping("/findAll")
    public List<Dept> findAll(){
        logger.info("provider:findAll:"+System.currentTimeMillis());
        List<Dept> list = deptService.findAll();
        return list;
    }

}
