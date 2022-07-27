package com.hrio.springboot.filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Springboot主启动类
 *
 * @author zhanghl
 * @date 2022/06/16
 */
@SpringBootApplication
@ServletComponentScan("com.hrio.springboot.filter.scan")
public class FilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilterApplication.class, args);
    }

}
