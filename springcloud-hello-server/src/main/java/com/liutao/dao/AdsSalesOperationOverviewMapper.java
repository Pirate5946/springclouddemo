package com.liutao.dao;

import com.liutao.entity.AdsSalesOperationOverview;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 电销运营-数据概览(AdsSalesOperationOverview)表数据库访问层
 *
 * @author liutao
 * @since 2020-06-06 19:11:17
 */
@Mapper
public interface AdsSalesOperationOverviewMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdsSalesOperationOverview queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdsSalesOperationOverview> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param adsSalesOperationOverview 实例对象
     * @return 对象列表
     */
    List<AdsSalesOperationOverview> queryAll(AdsSalesOperationOverview adsSalesOperationOverview);

    /**
     * 新增数据
     *
     * @param adsSalesOperationOverview 实例对象
     * @return 影响行数
     */
    int insert(AdsSalesOperationOverview adsSalesOperationOverview);

    /**
     * 修改数据
     *
     * @param adsSalesOperationOverview 实例对象
     * @return 影响行数
     */
    int update(AdsSalesOperationOverview adsSalesOperationOverview);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}