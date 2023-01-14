package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @EnableAspectJAutoProxy 使用注解开发aop
 */
@Configuration
@ComponentScan("org.example")
@EnableAspectJAutoProxy
public class SpringConfig {
}
