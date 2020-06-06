package com.liutao.service;

import com.liutao.entity.AdsSalesOperationOverview;
import com.liutao.dao.AdsSalesOperationOverviewMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 电销运营-数据概览(AdsSalesOperationOverview)表服务实现类
 *
 * @author liutao
 * @since 2020-06-06 19:11:17
 */
@Service("adsSalesOperationOverviewService")
public class AdsSalesOperationOverviewService {
    @Resource
    private AdsSalesOperationOverviewMapper adsSalesOperationOverviewMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public AdsSalesOperationOverview queryById(Integer id) {
        return this.adsSalesOperationOverviewMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    public List<AdsSalesOperationOverview> queryAllByLimit(int offset, int limit) {
        return this.adsSalesOperationOverviewMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param adsSalesOperationOverview 实例对象
     * @return 实例对象
     */
    public AdsSalesOperationOverview insert(AdsSalesOperationOverview adsSalesOperationOverview) {
        this.adsSalesOperationOverviewMapper.insert(adsSalesOperationOverview);
        return adsSalesOperationOverview;
    }

    /**
     * 修改数据
     *
     * @param adsSalesOperationOverview 实例对象
     * @return 实例对象
     */
    public AdsSalesOperationOverview update(AdsSalesOperationOverview adsSalesOperationOverview) {
        this.adsSalesOperationOverviewMapper.update(adsSalesOperationOverview);
        return this.queryById(adsSalesOperationOverview.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Integer id) {
        return this.adsSalesOperationOverviewMapper.deleteById(id) > 0;
    }
}