package dependencyInjection;

public class Square implements Shape{
    public Draw3d draw3d;
    public Draw2d draw2d;

    @Override
    public void drawShape2d() {
        draw2d.draw("Square");
    }
    @Override
    public void drawShape3d() {
        draw3d.draw("Square");
    }

    public void setDraw3d (Draw3d draw3d){
        this.draw3d =draw3d;
    }
    public void setDraw2d(Draw2d draw2d){
        this.draw2d =draw2d;
    }
}
