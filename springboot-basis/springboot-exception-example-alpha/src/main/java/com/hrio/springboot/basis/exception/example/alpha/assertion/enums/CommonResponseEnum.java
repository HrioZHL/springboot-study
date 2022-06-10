package com.hrio.springboot.basis.exception.example.alpha.assertion.enums;

import com.hrio.springboot.basis.exception.example.alpha.assertion.CommonExceptionAssert;

/**
 * @author Hrio
 * @date 2022/05/31
 */
public enum CommonResponseEnum implements CommonExceptionAssert {

    /**
     * 通用异常
     */
    SERVER_ERROR("9999", "网络异常"),

    /**
     * 成功返回
     */
    SERVER_SUCCESS("2000", "调用成功");
    /**
     * 状态码
     */
    private final String code;

    /**
     * 描述
     */
    private final String message;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    CommonResponseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
