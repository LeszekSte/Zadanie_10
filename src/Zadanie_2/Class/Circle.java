package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.GeometricShape;

import java.util.PrimitiveIterator;

public class Circle extends GeometricShape {

    private double circleArea;

    public Circle(double rCircle) {
        super(rCircle);
    }

    public double getArea() {
        return circleArea;
    }

    public void setCircleArea(double circleArea) {
        this.circleArea = circleArea;
    }

    @Override
    public String toString() {
        return "Koło " + "promieniu [" + getrCircle() + "] " ;
    }
}
