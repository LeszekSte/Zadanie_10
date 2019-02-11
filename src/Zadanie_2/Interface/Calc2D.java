package Zadanie_2.Interface;

import Zadanie_2.Class.Circle;
import Zadanie_2.Class.Rectangle;



public interface Calc2D {
    final double PI =Math.PI;

    double circleArea(Circle circle);
    double rectangleArea(Rectangle rectangle);

}
