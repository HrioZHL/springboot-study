package com.hrio.springboot.basis.exception.example.exception;

import com.hrio.springboot.basis.exception.example.controller.TestExceptionController;
import com.hrio.springboot.basis.exception.example.entity.RespInfo;
import com.hrio.springboot.basis.exception.example.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @author Hrio
 * @date 2022/05/25
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public RespInfo<?> handleBusinessException(BusinessException businessException) {
        log.error("请求发生异常", businessException);
        return RespInfo.fail(businessException.getMessage());
    }

}
