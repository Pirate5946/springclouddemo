package com.liutao.common;

import cn.hutool.core.collection.CollUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * @author yangyanshou.
 * @desc ApiResult
 * @date 2020/7/7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResult<T> implements Serializable {
    private int code;
    private String message;
    private T data;
    private int count = 0;

    public static <T> ApiResult<T> successResult() {
        return successResult(0, "success", null, 0);
    }

    /**
     * 通过data构造响应结果.
     */
    public static <T> ApiResult<T> successResult(T data) {
        if (data instanceof java.util.List) {
            List<?> dataTemp = (List<?>) data;
            if (CollUtil.isNotEmpty(dataTemp)) {
                return successResult(data, dataTemp.size());
            }
        }
        return successResult(data, 0);
    }

    /**
     * 根据data、count构造响应结果.
     */
    public static <T> ApiResult<T> successResult(T data, int count) {
        return successResult("success", data, count);
    }

    /**
     * 根据msg、data、count构造响应结果.
     */
    public static <T> ApiResult<T> successResult(String msg, T data, int count) {
        return successResult(0, "success", data, count);
    }

    /**
     * 构造响应结果.
     * @param code 响应码
     * @param msg 提示语
     * @param data 响应数据
     * @param count count
     * @return 响应结果
     */
    public static <T> ApiResult<T> successResult(int code, String msg, T data, Integer count) {
        return new ApiResult(code, msg, data, count);
    }

    /**
     * 构造失败响应结果.
     */
    public static <T> ApiResult<T> failResult(String message) {
        return failResult(-1, StringUtils.isEmpty(message) ? "fail" : message);
    }

    /**
     * 构造失败响应结果.
     * @param code 响应码
     * @param message 提示语
     * @return ApiResult 失败响应
     */
    public static <T> ApiResult<T> failResult(int code, String message) {
        return new ApiResult(code, message, null, 0);
    }

    /**
     * 构造失败响应结果.
     * @param code 响应码
     * @param message 提示语
     * @return ApiResult 失败响应
     */
    public static <T> ApiResult<T> failResult(int code, String message, T data) {
        return new ApiResult(code, message, data, 0);
    }

}
