package Zadanie_2.Class;

import Zadanie_2.Interface.Calc2D;
import Zadanie_2.Interface.Calc3D;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    double lineLength(Line2D line) {
        return super.lineLength(line);
    }

    @Override
    public double circleArea(Circle circle) {

        return   2* PI *Math.pow(circle.getrCircle() ,2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getBokA()*rectangle.getBokB();
    }


    @Override
    public double ballVolume(Ball ball) {
        return 4/3*PI*ball.getrBall();
    }

    @Override
    public double cubeVolume(Cube cube) {
        return 0;
    }
}
