package dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Circle circle = container.getBean("myCircle" , Circle.class);
        circle.drawShape2d();
        circle.drawShape3d();

        Square square = container.getBean("mySquare", Square.class);
        square.drawShape2d();
        square.drawShape3d();
    }
    }
