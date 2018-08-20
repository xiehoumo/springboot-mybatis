package com.xiehou.share.springboot;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.bull.javamelody.MonitoringFilter;
import net.bull.javamelody.SessionListener;

/**
 * @Author: xiehou
 * @Date: 2018/8/10 22:11
 * @Description: JAVAMELODY监控配置
 */
@Configuration
public class JavamelodyConfiguration {

    @Bean
    public FilterRegistrationBean monitorFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MonitoringFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public ServletListenerRegistrationBean sessionListener() {
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new SessionListener());
        return servletListenerRegistrationBean;
    }
}
