package com.hrio.springboot.basis.exception.example.config;

import ch.qos.logback.core.PropertyDefinerBase;

/**
 * logback当前操作系统用户根目录获取
 *
 * @author Hrio
 * @date 2022/05/30
 */
public class LogBackUserHomeDefiner extends PropertyDefinerBase {

    @Override
    public String getPropertyValue() {
        // 获取当前操作系统的用户目录 User home directory
        String userHome = System.getProperty("user.home");
        return userHome + "/logs";
    }

}
