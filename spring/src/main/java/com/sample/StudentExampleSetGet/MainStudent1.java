package com.sample.StudentExampleSetGet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent1 {
    
     public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student1 sob = (Student1) context.getBean("student1");

        sob.display();
    }
}
