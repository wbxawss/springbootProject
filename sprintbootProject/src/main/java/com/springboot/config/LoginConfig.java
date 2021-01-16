package com.springboot.config;

import com.springboot.interceptor.AdminInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @作者：hawk
 * @日期：2021/1/13 0013 21:46
 */
@Configuration
public class LoginConfig implements WebMvcConfigurer {
        @Override
        public void addInterceptors(InterceptorRegistry registry) {
                String[] addPathPatterns = {
                        "/**"
                };//所有路径都被拦截
                String[] excludePathPatterns = {
                        "/nologin",
                        "/login",
                        "/doLogin",
                        "/**/login.html"
                };//添加例外
                //注册TestInterceptor拦截器
//                InterceptorRegistration registration = registry.addInterceptor(new AdminInterceptor());
//                registration.addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);

        }
}
