package com.liutao.controller;

import com.liutao.entity.AdsSalesOperationOverview;
import com.liutao.service.AdsSalesOperationOverviewService;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * 电销运营-数据概览(AdsSalesOperationOverview)表控制层
 *
 * @author liutao
 * @since 2020-06-06 19:11:17
 */
@Api(tags = "电销运营-数据概览(AdsSalesOperationOverview)") 
@RestController
@RequestMapping("adsSalesOperationOverview")
public class AdsSalesOperationOverviewController {
    /**
     * 服务对象
     */
    @Resource
    private AdsSalesOperationOverviewService adsSalesOperationOverviewService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "根据id查询 电销运营-数据概览")
    @GetMapping("selectOne/{id}")
    @ApiImplicitParam(name = "id", value = "商品ID",  paramType = "path", required = true, dataType =  "Integer")
    public AdsSalesOperationOverview selectOne(@ApiParam(value = " ID") @PathVariable("id") Integer id) {
        return this.adsSalesOperationOverviewService.queryById(id);
    }

}