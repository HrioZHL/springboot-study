package com.hrio.springboot.basis.exception.example.controller;

import com.hrio.springboot.basis.exception.example.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试全局异常处理
 *
 * @author Hrio
 * @date 2022/05/30
 */
@RestController
@RequestMapping("/test/example")
public class TestExceptionController {

    /**
     * 测试业务异常
     */
    @GetMapping("businessException")
    public void testBusinessException() {
        throw new BusinessException("业务异常");
    }
}
