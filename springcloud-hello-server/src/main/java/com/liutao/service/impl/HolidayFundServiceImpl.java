package com.liutao.service.impl;

import com.liutao.entity.HolidayFund;
import com.liutao.dao.HolidayFundMapper;
import com.liutao.service.HolidayFundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 小可爱休假基金表(HolidayFund)表服务实现类.
 *
 * @author liutao
 * @since 2020-11-29 19:23:43
 */
@Service("holidayFundService")
public class HolidayFundServiceImpl implements HolidayFundService {
    @Resource
    private HolidayFundMapper holidayFundDao;

    /**
     * 通过ID查询单条数据.
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public HolidayFund queryById(Integer id) {
        return this.holidayFundDao.queryById(id);
    }

    /**
     * 查询所有数据.
     *
     * @return 对象列表
     */
    @Override
    public List<HolidayFund> queryAll(HolidayFund holidayFund) {
        return this.holidayFundDao.queryAll(holidayFund);
    }

    /**
     * 查询多条数据.
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<HolidayFund> queryAllByLimit(int offset, int limit) {
        return this.holidayFundDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据.
     *
     * @param holidayFund 实例对象
     * @return 实例对象
     */
    @Override
    public HolidayFund insert(HolidayFund holidayFund) {
        this.holidayFundDao.insert(holidayFund);
        return holidayFund;
    }

    /**
     * 修改数据.
     *
     * @param holidayFund 实例对象
     * @return 实例对象
     */
    @Override
    public HolidayFund update(HolidayFund holidayFund) {
        this.holidayFundDao.update(holidayFund);
        return this.queryById(holidayFund.getId());
    }

    /**
     * 通过主键删除数据.
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.holidayFundDao.deleteById(id) > 0;
    }

    @Override
    public HolidayFund queryLast() {
        return this.holidayFundDao.queryLast();
    }
}