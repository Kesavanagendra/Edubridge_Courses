package com.sample.ConfigurationJavaBasedAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sample.Employee")
public class BeanConfig {
    
}
