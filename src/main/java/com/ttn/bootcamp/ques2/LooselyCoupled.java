package com.ttn.bootcamp.ques2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Write a program to demonstrate Loosely Coupled code.
 */

public class LooselyCoupled {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("shape.xml");
        Polygon polygon = (Polygon) applicationContext.getBean("Polygon");
        polygon.shape();


    }

}
