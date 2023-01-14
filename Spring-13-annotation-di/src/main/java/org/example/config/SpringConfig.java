package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @PropertySource 加载配置文件
 */
@Configuration
@ComponentScan("org.example")
@PropertySource("jdbc.properties")
public class SpringConfig {
}
