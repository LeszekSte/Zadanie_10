package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.GeometricShape;

public class Rectangle extends GeometricShape {

    public Rectangle(double bokA, double bokB) {
        super(bokA, bokB);
    }

    double retengrleArea(Rectangle rectangle){
      return rectangle.getBokA()*rectangle.getBokB();
    }

}
