package com.hrio.springboot.basis.controller;

import com.hrio.springboot.basis.config.exception.ResourceNotFoundByStatusException;
import com.hrio.springboot.basis.config.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 * 测试异常Controller
 *
 * @author zhanghl
 * @date 2022/05/16
 */
@RestController
@RequestMapping("/exception")
public class ExceptionByStatusController {

    @GetMapping("/resourceNotFoundByStatusException")
    public void exception() {
        throw new ResourceNotFoundByStatusException("资源不存在2！");
    }

    @GetMapping("/resourceNotFoundByStatusException2")
    public void exception1() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "资源不存在3！", new ResourceNotFoundException());
    }
}
