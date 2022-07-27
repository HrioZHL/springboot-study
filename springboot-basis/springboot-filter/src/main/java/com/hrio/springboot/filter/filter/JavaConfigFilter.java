package com.hrio.springboot.filter.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 自定义过滤器 2
 *
 * @author zhanghl
 * @date 2022/06/17
 */
@Slf4j
public class JavaConfigFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("初始化过滤器：" + filterConfig.getFilterName());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 对请求进行预处理
        log.info("自定义过滤器 JavaConfigFilter 开始对请求进行预处理");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        log.info("请求的接口地址为：{}", request.getRequestURI());
        long startTime = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        long endTime = System.currentTimeMillis();
        log.info("该用户的请求已经处理完毕，请求花费的时间为：{}", endTime - startTime);
    }

    @Override
    public void destroy() {
        log.info("销毁过滤器：JavaConfigFilter");
    }
}
