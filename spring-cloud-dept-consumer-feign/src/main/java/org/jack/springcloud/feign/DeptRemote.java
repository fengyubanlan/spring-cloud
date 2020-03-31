package org.jack.springcloud.feign;

import org.jack.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("DEPT-PROVIDER")
public interface DeptRemote {

    /**
     * 使用feign远程调用
     * @return
     */
    @RequestMapping("/dept/findAll")
    public List<Dept> findAll();

}
