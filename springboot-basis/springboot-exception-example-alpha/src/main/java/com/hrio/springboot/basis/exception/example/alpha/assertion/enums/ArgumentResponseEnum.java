package com.hrio.springboot.basis.exception.example.alpha.assertion.enums;

import com.hrio.springboot.basis.exception.example.alpha.assertion.BusinessExceptionAssert;
import com.hrio.springboot.basis.exception.example.alpha.assertion.CommonExceptionAssert;
import com.hrio.springboot.basis.exception.example.alpha.exception.BaseException;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 参数异常
 *
 * @author Hrio
 * @date 2022/05/31
 */
@Getter
@AllArgsConstructor
public enum ArgumentResponseEnum implements CommonExceptionAssert {

    /**
     * 参数校验异常
     */
    VALID_ERROR("4500", "参数校验异常:{0}");

    /**
     * 状态码
     */
    private final String code;

    /**
     * 描述
     */
    private final String message;

}
