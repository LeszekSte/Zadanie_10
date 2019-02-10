package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.GeometricShape;

public class Circle extends GeometricShape {
    private double r;
    private double areaCircle;


    public Circle(double r) {
        super();
        this.r = r;
    }

    public double getAreaCircle() {
        return areaCircle;
    }

    public void setAreaCircle(double powCircle) {
        this.areaCircle = powCircle;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", powCircle=" + areaCircle +
                '}';
    }
}
