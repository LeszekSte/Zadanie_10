package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.GeometricShape;

public class Rectangle extends GeometricShape {



    private double bokA;
    private double bokB;

    public Rectangle(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }




    @Override
    public String toString() {
        return "Prostokąt o bokach [" + bokA + ", " + bokB + "] ";
    }
}
