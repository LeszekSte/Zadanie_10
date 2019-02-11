package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.Shape;

public class TestClass {

    public static void main(String[] args) {
        ShapeCalculator shCalc = new ShapeCalculator();
        Circle kolo = new Circle(1);

        System.out.println("Pow. koła o promieniu " + kolo.toString()+ " wynosi " + shCalc.circleArea(kolo));


        Line2D line2D = new Line2D(1,1,4,4);
        System.out.println("Długość odcinka " + line2D.toString()+ " wynosi " + shCalc.lineLength(line2D));

        Rectangle prostokat = new Rectangle(4,6);
        System.out.println( prostokat.toString()+ " wynosi " + shCalc.rectangleArea(prostokat));

    }

}
