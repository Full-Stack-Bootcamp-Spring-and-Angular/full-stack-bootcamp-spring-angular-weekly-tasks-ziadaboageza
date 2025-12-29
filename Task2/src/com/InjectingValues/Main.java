package com.InjectingValues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = container.getBean("myCar" , Car.class);
        car.storeVehicle();
        Plane plane = container.getBean("myPlane" , Plane.class);
        plane.storeVehicle();
    }
}
