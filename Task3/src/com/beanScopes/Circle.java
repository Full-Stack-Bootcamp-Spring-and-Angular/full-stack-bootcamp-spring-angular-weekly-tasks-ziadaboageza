package com.beanScopes;

public class Circle implements Shape{
    public Draw2d draw2d;
    public Draw3d draw3d;

    public Circle (Draw3d draw3d,Draw2d draw2d){
        this.draw2d=draw2d;
        this.draw3d=draw3d;
    }
    @Override
    public void draw2dShape() {
        draw2d.draw("Circle");
    }
    public void draw3dShape() {
        draw3d.draw("Circle");
    }


}
