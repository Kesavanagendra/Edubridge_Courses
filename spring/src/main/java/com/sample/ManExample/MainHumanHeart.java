package com.sample.ManExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHumanHeart {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HumanBody hob = (HumanBody)context.getBean("humanbody");

        hob.humanAlive();
    }
    
}
