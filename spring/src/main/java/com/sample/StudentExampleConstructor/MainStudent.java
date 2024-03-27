package com.sample.StudentExampleConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student sob = (Student) context.getBean("student");

        sob.display();
    }

    
    
}
