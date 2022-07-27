package com.hrio.springboot.filter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试过滤器接口
 * 使用 JavaConfig 方式
 *
 * @author zhanghl
 * @date 2022/07/27
 */
@RestController
@RequestMapping("/filter/java/config")
public class JavaConfigFilter {

    @GetMapping("/test")
    public String test() throws InterruptedException {
        Thread.sleep(1000);
        return "Hello JavaConfigFilter!";
    }

}
