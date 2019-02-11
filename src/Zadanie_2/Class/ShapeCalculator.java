package Zadanie_2.Class;

import Zadanie_2.Interface.Calc2D;
import Zadanie_2.Interface.Calc3D;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {


    @Override
    public void circleArea(Circle circle) {
        circle.setCircleArea( 2* PI *Math.pow(circle.getrCircle() ,2));
    }

    @Override
    public void rectangleArea(Rectangle rectangle) {
        double hightRect = rectangle.getxPointEnd()-rectangle.getxPointStart();

    }

    @Override
    public double ballVolume(Ball ball) {
        return 0;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return 0;
    }
}
