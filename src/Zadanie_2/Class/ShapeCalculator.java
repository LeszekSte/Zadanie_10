package Zadanie_2.Class;

import Zadanie_2.Interface.Calc2D;

public class ShapeCalculator extends LineCalc implements Calc2D {


    @Override
    public void circleArea(Circle circle) {
        circle.setAreaCircle( 2* PI *Math.pow(circle.getR() ,2));
    }

    @Override
    public void rectangleArea(Rectangle rectangle) {
        double hightRect = rectangle.getxPointEnd()-rectangle.getxPointStart();

    }
}
