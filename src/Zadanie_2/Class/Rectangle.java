package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.GeometricShape;

public class Rectangle extends GeometricShape {

    private double areaRectangle;

    public Rectangle(double xPointStart, double yPointStart, double xPointEnd, double yPointEnd) {
        super(xPointStart, yPointStart, xPointEnd, yPointEnd);
    }

    public double getAreaRectangle() {
        return areaRectangle;
    }

    public void setAreaRectangle(double areaRectangle) {
        this.areaRectangle = areaRectangle;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "areaRectangle=" + areaRectangle +
                '}';
    }
}
