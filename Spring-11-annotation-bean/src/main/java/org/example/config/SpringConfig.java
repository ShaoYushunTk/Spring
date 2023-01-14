package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 纯注解开发，不需要写配置文件
 * @Configuration 指定该类为配置类
 * @ComponentScan 组件扫描 替换原配置文件中 <context:component-scan base-package="org.example"/>
 * 配置多个使用数组 {"org.example.dao","org.example.service"}
 */
@Configuration
@ComponentScan("org.example")
public class SpringConfig {
}
