package com.hrio.springboot.filter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试过滤器接口
 * 使用 @WebFilter+@ServletComponentScan 方式
 *
 * @author zhanghl
 * @date 2022/07/27
 */
@RestController
@RequestMapping("/filter/scan")
public class ScanFilterController {

    @GetMapping("/test")
    public String test() throws InterruptedException {
        Thread.sleep(1000);
        return "Hello ScanFilter!";
    }

}
