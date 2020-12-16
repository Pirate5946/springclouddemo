package com.liutao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 小可爱休假基金表(HolidayFund)实体类.
 *
 * @author liutao
 * @since 2020-11-29 19:23:42
 */
@Data
@ApiModel("小可爱休假基金表")
public class HolidayFund implements Serializable {
    private static final long    serialVersionUID = 320939960425636317L;
    /**
     * 自增id.
     */
    @ApiModelProperty("自增id")
    private              Integer id;

    /**
     * 事件日期.
     */
    @ApiModelProperty("事件日期")
    private String eventDate;

    /**
     * 事件描述.
     */
    @ApiModelProperty("事件描述")
    private String eventDesc;

    /**
     * 发生金额.
     */
    @ApiModelProperty("发生金额")
    private Integer eventMoney;

    /**
     * 金额总计.
     */
    @ApiModelProperty("金额总计")
    private Integer total;

    @ApiModelProperty("备注")
    private String remark;

    /**
     * ts.
     */
    @ApiModelProperty("ts")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date ts;

}