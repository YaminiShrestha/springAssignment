package com.ttn.bootcamp.ques1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Write a program to demonstrate Tightly Coupled code.
 */


public class TightlyCoupled {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ques1.xml");
        Polygon polygon = (Polygon) applicationContext.getBean("Polygon");
        double result = polygon.calculate(6);
        System.out.println(result);

    }
}
