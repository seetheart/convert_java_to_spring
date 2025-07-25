package car.example.bean;

import car.constructor.injection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConstructorInjection.xml");
        Car myCar = (Car) applicationContext.getBean("myCar");
        myCar.displayDetails();
    }
}
