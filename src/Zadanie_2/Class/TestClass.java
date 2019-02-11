package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.Shape;

public class TestClass {

    public static void main(String[] args) {
        ShapeCalculator shCalc = new ShapeCalculator();
        Circle kolo = new Circle(1);

        System.out.println("Pow."+ kolo.toString()+ " wynosi " + shCalc.circleArea(kolo));
        System.out.println("Pow."+ kolo.toString()+ " wynosi " + shCalc.shapeArea(kolo));


        Line2D line2D = new Line2D(1,1,4,4);
        System.out.println("Długość "+line2D.toString()+ " wynosi " + shCalc.lineLength(line2D));

        Rectangle prostokat = new Rectangle(4,6);
        System.out.println("Powierzchnia " + prostokat.toString()+ " wynosi " + shCalc.rectangleArea(prostokat));
        System.out.println("Powierzchnia " + prostokat.toString()+ " wynosi " + shCalc.shapeArea(prostokat));

        Cube cube = new Cube(2,3,4);
        System.out.println("Powierzchnia " + cube.toString()+ " wynosi " + shCalc.volume(cube));
        System.out.println("Powierzchnia " + cube.toString()+ " wynosi " + shCalc.cubeVolume(cube));

    }

}
