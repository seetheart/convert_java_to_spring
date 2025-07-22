package com.example.componentscan;

import car.example.autowire.name.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("componentscanContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.toString());
    }
}
