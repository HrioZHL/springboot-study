package com.hrio.springboot.filter.scan;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 自定义过滤器（通过@WebFilter注解实现）
 * 使用 @WebFilter 方式无法指定顺序，如果想要控制过滤器的顺序，可以通过 Filter 的文件名来控制
 *
 * @author zhanghl
 * @date 2022/07/27
 */
@Slf4j
@WebFilter(urlPatterns = "/filter/scan/*")
public class ScanFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        log.info("初始化过滤器：" + filterConfig.getFilterName());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("ScanFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        log.info("销毁过滤器：ScanFilter");
    }

}
