package com.hrio.springboot.basis.exception.example.alpha.assertion;

/**
 * 异常返回码枚举接口
 *
 * @author Hrio
 * @date 2022/6/6
 */
public interface IResponseEnum {
    /**
     * 获取状态码
     *
     * @return 状态码
     */
    String getCode();

    /**
     * 获取返回消息
     *
     * @return 消息
     */
    String getMessage();
}