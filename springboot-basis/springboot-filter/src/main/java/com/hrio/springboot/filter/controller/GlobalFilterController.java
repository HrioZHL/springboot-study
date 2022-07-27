package com.hrio.springboot.filter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试过滤器接口
 * 使用 @Component+@Order 方式
 *
 * @author zhanghl
 * @date 2022/06/17
 */
@RestController
@RequestMapping("/filter/global")
public class GlobalFilterController {

    @GetMapping("/test")
    public String test() throws InterruptedException {
        Thread.sleep(1000);
        return "Hello GlobalFilter!";
    }

}
