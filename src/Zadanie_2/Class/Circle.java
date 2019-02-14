package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.GeometricShape;



public class Circle extends GeometricShape {

    public Circle(double rCircle) {
        this.rCircle = rCircle;
    }

    private double rCircle;


    public double getrCircle() {
        return rCircle;
    }

    public void setrCircle(double rCircle) {
        this.rCircle = rCircle;
    }

    @Override
    public String toString() {
        return "Koło o promieniu [" + rCircle + "] " ;
    }


}
