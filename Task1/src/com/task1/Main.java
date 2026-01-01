package com.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Circle circle = container.getBean("circleShape", Circle.class);
        System.out.println(circle.getArea(value));
        Square square = container.getBean("squareShape", Square.class);
        System.out.println(square.getArea(value));
    }
}