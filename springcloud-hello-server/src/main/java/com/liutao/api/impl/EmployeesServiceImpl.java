package com.liutao.api.impl;

import com.liutao.entity.Employees;
import com.liutao.dao.EmployeesDao;
import com.liutao.api.EmployeesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Employees)表服务实现类
 *
 * @author makejava
 * @since 2020-05-07 13:04:46
 */
@Service("employeesService")
public class EmployeesServiceImpl implements EmployeesService {
    @Resource
    private EmployeesDao employeesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param empNo 主键
     * @return 实例对象
     */
    @Override
    public Employees queryById(Integer empNo) {
        return this.employeesDao.queryById(empNo);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Employees> queryAllByLimit(int offset, int limit) {
        return this.employeesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param employees 实例对象
     * @return 实例对象
     */
    @Override
    public Employees insert(Employees employees) {
        this.employeesDao.insert(employees);
        return employees;
    }

    /**
     * 修改数据
     *
     * @param employees 实例对象
     * @return 实例对象
     */
    @Override
    public Employees update(Employees employees) {
        this.employeesDao.update(employees);
        return this.queryById(employees.getEmpNo());
    }

    /**
     * 通过主键删除数据
     *
     * @param empNo 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer empNo) {
        return this.employeesDao.deleteById(empNo) > 0;
    }
}