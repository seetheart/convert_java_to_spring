package org.example;

import car.constructor.injection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LooseCoupling {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("challengeBeanContext.xml");
        UserManager userManager = (UserManager) applicationContext.getBean("userManager");

        System.out.println(userManager.getUserDetails());
    }
}