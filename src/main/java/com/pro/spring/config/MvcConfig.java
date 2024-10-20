package com.pro.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        WebMvcConfigurer.super.addViewControllers(registry);
        registry.addViewController("/test").setViewName("/");
        registry.addViewController("/login").setViewName("/login/login.html");
        for (int i = 0; i < 5; i++)
            registry.addViewController("/test" + i).setViewName("/test" + i);

    }
}
