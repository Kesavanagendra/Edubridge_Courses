package com.sample.CheckingExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTextCheck {

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        TextEditor tob = (TextEditor) context.getBean("texteditor");

        tob.texting();
    }
    
}
