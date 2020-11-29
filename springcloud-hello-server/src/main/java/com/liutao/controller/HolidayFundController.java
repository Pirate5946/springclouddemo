package com.liutao.controller;

import cn.hutool.core.date.DateUtil;
import com.liutao.common.ApiResult;
import com.liutao.entity.HolidayFund;
import com.liutao.service.HolidayFundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 小可爱休假基金表(HolidayFund)表控制层.
 *
 * @author liutao
 * @since 2020-11-29 19:23:44
 */
@Api(tags = "小可爱休假基金表(HolidayFund)")
@RestController
@RequestMapping("holidayFund")
public class HolidayFundController {
    /**
     * 服务对象.
     */
    @Autowired
    private HolidayFundService holidayFundService;

    /**
     * 通过主键查询单条数据.
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "根据id查询 小可爱休假基金表")
    @GetMapping("selectOne/{id}")
    public HolidayFund selectOne(@ApiParam(value = "自增id ID") @PathVariable("id") Integer id) {
        return this.holidayFundService.queryById(id);
    }

    @PostMapping("put")
    public ApiResult<HolidayFund> put(@RequestBody HolidayFund holidayFund) {
        HolidayFund lastEvent = this.holidayFundService.queryLast();
        int         total         = lastEvent.getTotal() + holidayFund.getEventMoney();
        holidayFund.setTotal(total);
        holidayFund.setTs(DateUtil.date());
        this.holidayFundService.insert(holidayFund);
        return ApiResult.successResult();
    }

    @GetMapping("list")
    public ApiResult<List<HolidayFund>> queryAll(@RequestParam(value = "page", required = false) String page,
                                                 @RequestParam(value = "limit", required = false) String limit) {
        List<HolidayFund> holidayFunds = this.holidayFundService.queryAll(null);
        return ApiResult.successResult(holidayFunds);
    }

}