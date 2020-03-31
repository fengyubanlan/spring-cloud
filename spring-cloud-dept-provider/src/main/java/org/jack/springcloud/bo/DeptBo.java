package org.jack.springcloud.bo;

import org.jack.springcloud.dao.DeptDao;
import org.jack.springcloud.entity.Dept;
import org.jack.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangjie
 * @classname DeptBo
 * @date 2020/03/31 0031 12:19:28
 * @description
 **/
@Service
public class DeptBo implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept findById(Long id) {
        if(id == null) {
            return null;
        }
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
