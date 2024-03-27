package com.sample.ConfigurationJavaBasedAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEmployee {

    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Employee eob = (Employee) context.getBean("employee");

        eob.display();
    }
    
}
