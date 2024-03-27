package com.sample.EmployeeExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee eob = (Employee) context.getBean("employee");
        eob.display();
    }
}
