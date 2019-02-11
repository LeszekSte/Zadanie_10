package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.GeometricShape;

public class Rectangle extends GeometricShape {

   private  double retengrleArea;

    public Rectangle(double bokA, double bokB) {
        super(bokA, bokB);
    }


    public double getRetengrleArea() {
        return retengrleArea;
    }

    public void setRetengrleArea(double retengrleArea) {
        this.retengrleArea = retengrleArea;
    }

    @Override
    public String toString() {
        return "Prostokąt o bokach {" + getBokA() +", " + getBokB() + " ";
    }
}
