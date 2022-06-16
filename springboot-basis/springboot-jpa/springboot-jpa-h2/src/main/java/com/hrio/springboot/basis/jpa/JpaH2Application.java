package com.hrio.springboot.basis.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Springboot主启动类
 *
 * @author Hrio
 * @date 2022/06/13
 */
@SpringBootApplication
public class JpaH2Application {

    public static void main(String[] args) {
        SpringApplication.run(JpaH2Application.class, args);
    }

}
