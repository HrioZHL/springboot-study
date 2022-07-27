package com.hrio.springboot.filter.config;

import com.hrio.springboot.filter.filter.GlobalFilter;
import com.hrio.springboot.filter.filter.JavaConfigFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 过滤器配置类
 *
 * @author zhanghl
 * @date 2022/07/26
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<JavaConfigFilter> getCustomFilter() {
        FilterRegistrationBean<JavaConfigFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setOrder(1);
        filterFilterRegistrationBean.setFilter(new JavaConfigFilter());
        filterFilterRegistrationBean.setUrlPatterns(new ArrayList<>(Collections.singletonList("/filter/java/config/*")));
        return filterFilterRegistrationBean;
    }


}
