package com.beanScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shape circle = container.getBean("myCircle" , Circle.class);
        Shape circle1 = container.getBean("myCircle" , Circle.class);
        System.out.println(circle);
        System.out.println(circle1);

        circle.draw2dShape();
        circle.draw3dShape();

        Shape square = container.getBean("mySquare" , Square.class);
        Shape square2= container.getBean("mySquare" , Square.class);
        square.draw2dShape();
        square.draw3dShape();

        System.out.println(square);
        System.out.println(square2);

    }
}