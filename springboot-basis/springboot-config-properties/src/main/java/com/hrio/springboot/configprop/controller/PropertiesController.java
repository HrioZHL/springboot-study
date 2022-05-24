package com.hrio.springboot.configprop.controller;

import com.hrio.springboot.configprop.prpoperties.AccountProperties;
import com.hrio.springboot.configprop.prpoperties.MusicProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Properties测试接口
 *
 * @author zhanghl
 * @date 2022/05/13
 */
@RestController
@RequestMapping("/properties/get")
public class PropertiesController {

    @Value("${baidu-url}")
    private String baiduUrl;

    private final MusicProperties musicProperties;

    private final AccountProperties accountProperties;

    public PropertiesController(MusicProperties musicProperties, AccountProperties accountProperties) {
        this.musicProperties = musicProperties;
        this.accountProperties = accountProperties;
    }

    /**
     * 使用@Value注解获取配置文件配置
     *
     * @return
     */
    @GetMapping("/byValue")
    public String byValue() {
        return baiduUrl;
    }

    /**
     * 通过Properties配置文件获取
     *
     * @return
     */
    @GetMapping("/byPropertiesConfiguration")
    public MusicProperties byPropertiesConfiguration() {
        return musicProperties;
    }

    /**
     * 测试Properties校验
     *
     * @return
     */
    @GetMapping("/testValidation")
    public AccountProperties testValidation() {
        return accountProperties;
    }
}
