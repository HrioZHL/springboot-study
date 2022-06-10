package com.hrio.springboot.basis.exception.controller;

import com.hrio.springboot.basis.exception.exception.ResourceNotFoundByStatusException;
import com.hrio.springboot.basis.exception.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试异常Controller
 *
 * @author Hrio
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
