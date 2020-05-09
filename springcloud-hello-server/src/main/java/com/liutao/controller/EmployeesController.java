package com.liutao.controller;

import com.liutao.entity.Employees;
import com.liutao.api.EmployeesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Employees)表控制层
 *
 * @author makejava
 * @since 2020-05-07 13:04:49
 */
@RestController
@RequestMapping("employees")
public class EmployeesController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeesService employeesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Employees selectOne(Integer id) {
        return this.employeesService.queryById(id);
    }

}