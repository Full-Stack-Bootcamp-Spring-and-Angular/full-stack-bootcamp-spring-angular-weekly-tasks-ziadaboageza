package dependencyInjection;

public class Circle implements Shape{
    public Draw3d draw3d;
    public Draw2d draw2d;

    Circle (Draw2d draw2d , Draw3d draw3d){
        this.draw2d=draw2d;
        this.draw3d=draw3d;
    }
    @Override
    public void drawShape2d() {
        draw2d.draw("Circle");
    }
    @Override
    public void drawShape3d() {
        draw3d.draw("Circle");
    }
}
