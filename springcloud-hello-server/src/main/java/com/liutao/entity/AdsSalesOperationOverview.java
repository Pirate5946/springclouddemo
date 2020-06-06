package com.liutao.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.*;
import lombok.Data;

/**
 * 电销运营-数据概览(AdsSalesOperationOverview)实体类
 *
 * @author liutao
 * @since 2020-06-06 19:11:17
 */
@Data
@ApiModel("电销运营-数据概览")
public class AdsSalesOperationOverview implements Serializable {
    private static final long serialVersionUID = -69392349538022452L;
        
    @ApiModelProperty("$column.comment")
    private Integer id;
    
    /**
    * 考季
    */    
    @ApiModelProperty("考季")
    private String examSeasonName;
    
    /**
    * 部门
    */    
    @ApiModelProperty("部门")
    private String department;
    
    /**
    * 考季编码：1-全部 2-2020暑假 3-2020秋季 4-其他
    */    
    @ApiModelProperty("考季编码：1-全部 2-2020暑假 3-2020秋季 4-其他")
    private Integer examSeasonNameCode;
    
    /**
    * 购课人次
    */    
    @ApiModelProperty("购课人次")
    private Integer orderPeople;
    
    /**
    * 销售额
    */    
    @ApiModelProperty("销售额")
    private Double incomeAmount;
    
    /**
    * 客单价
    */    
    @ApiModelProperty("客单价")
    private Double guestUnitPrice;
    
    /**
    * 日期
    */    
    @ApiModelProperty("日期")
    private Integer dtDate;
    
    /**
    * 更新时间
    */    
    @ApiModelProperty("更新时间")
    private Date updateTime;
    
}