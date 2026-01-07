package com.task1;

import static java.lang.Math.*;

public class Circle implements Shape {

    @Override
    public double getArea(double radius) {
        return 2 * radius * Math.PI;
    }
}
