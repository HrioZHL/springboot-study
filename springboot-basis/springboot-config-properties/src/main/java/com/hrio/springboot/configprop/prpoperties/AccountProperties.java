package com.hrio.springboot.configprop.prpoperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * 属性配置类
 *
 * @author zhanghl
 * @date 2022/05/16
 */
@Data
@ConfigurationProperties(prefix = AccountProperties.PREFIX)
@Component
@Validated
public class AccountProperties {
    public static final String PREFIX = "my-account";

    private static final String DEFAULT_NAME = "TOM";

    private String name = DEFAULT_NAME;

    @NotEmpty
    @Email
    private String email;
}
