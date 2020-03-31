package org.jack.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.jack.springcloud.entity.Dept;

import java.util.List;

/**
 * @author 11329
 */
@Mapper
public interface DeptDao {

    /**
     * 根据主键id获取单个数据
     * @param id
     * @return
     */
    Dept findById(Long id);

    /**
     * 获取全部数据
     * @return
     */
    List<Dept> findAll();

}
