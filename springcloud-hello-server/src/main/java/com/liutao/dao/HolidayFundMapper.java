package com.liutao.dao;

import com.liutao.entity.HolidayFund;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 小可爱休假基金表(HolidayFund)表数据库访问层.
 *
 * @author liutao
 * @since 2020-11-29 19:23:43
 */
@Mapper
public interface HolidayFundMapper {

    /**
     * 通过ID查询单条数据.
     *
     * @param id 主键
     * @return 实例对象
     */
    HolidayFund queryById(Integer id);

    /**
     * 查询指定行数据.
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<HolidayFund> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询.
     *
     * @param holidayFund 实例对象
     * @return 对象列表
     */
    List<HolidayFund> queryAll(HolidayFund holidayFund);

    /**
     * 新增数据.
     *
     * @param holidayFund 实例对象
     * @return 影响行数
     */
    int insert(HolidayFund holidayFund);

    /**
     * 修改数据.
     *
     * @param holidayFund 实例对象
     * @return 影响行数
     */
    int update(HolidayFund holidayFund);

    /**
     * 通过主键删除数据.
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    HolidayFund queryLast();
}