package com.liutao.service;

import com.liutao.entity.HolidayFund;

import java.util.List;

/**
 * 小可爱休假基金表(HolidayFund)表服务接口.
 *
 * @author liutao
 * @since 2020-11-29 19:05:50
 */
public interface HolidayFundService {

    /**
     * 通过ID查询单条数据.
     *
     * @param id 主键
     * @return 实例对象
     */
    HolidayFund queryById(Integer id);

    /**
     * 查询多条数据.
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<HolidayFund> queryAllByLimit(int offset, int limit);

    List<HolidayFund> queryAll(HolidayFund holidayFund);

    /**
     * 新增数据.
     *
     * @param holidayFund 实例对象
     * @return 实例对象
     */
    HolidayFund insert(HolidayFund holidayFund);

    /**
     * 修改数据.
     *
     * @param holidayFund 实例对象
     * @return 实例对象
     */
    HolidayFund update(HolidayFund holidayFund);

    /**
     * 通过主键删除数据.
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}