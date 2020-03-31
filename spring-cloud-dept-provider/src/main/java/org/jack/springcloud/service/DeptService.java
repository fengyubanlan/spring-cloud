package org.jack.springcloud.service;

import org.jack.springcloud.entity.Dept;

import java.util.List;

/**
 * @author 11329
 */
public interface DeptService {

    /**
     * 根据主键id获取单个数据
     * @param id
     * @return
     */
    public Dept findById(Long id);

    /**
     * 获取全部数据
     * @return
     */
    public List<Dept> findAll();

}
