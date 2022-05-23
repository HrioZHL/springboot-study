package com.hrio.springboot.basis.controller;

import com.hrio.springboot.basis.config.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试异常Controller
 *
 * @author zhanghl
 * @date 2022/05/16
 */
@RestController
@RequestMapping("/exception")
public class ExceptionController {

    @GetMapping("/illegalArgumentException")
    public void exception() {
        throw new IllegalArgumentException();
    }

    @GetMapping("/resourceNotFoundException")
    public void exception2() {
        throw new ResourceNotFoundException();
    }
}
