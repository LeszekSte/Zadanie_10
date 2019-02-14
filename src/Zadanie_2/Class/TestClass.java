package Zadanie_2.Class;


import Zadanie_2.ClassAbstract.Shape;

public class TestClass {

    private static Object Circle;

    public static void main(String[] args) {

        ShapeCalculator calc = new ShapeCalculator();

        Shape[] shapes = new Shape[5];
        shapes[0] = new Line2D(1, 1, 5, 5);
        shapes[1] = new Circle(15);
        shapes[2] = new Rectangle(15, 10);
        shapes[3] = new Cube(10, 10, 10);
        shapes[4] = new Ball(15);


        for (int i = 0; i < shapes.length; i++) {
           double obl = calc.calculate(shapes[i]);

            System.out.println(calc.getInfoKształt() + shapes[i] +  " wynosi " +  obl);
        }



        }
    }
