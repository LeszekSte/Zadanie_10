package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.GeometricShape;
import Zadanie_2.ClassAbstract.Shape;
import Zadanie_2.ClassAbstract.Shape2D;
import Zadanie_2.ClassAbstract.Shape3D;
import Zadanie_2.Interface.Calc2D;
import Zadanie_2.Interface.Calc3D;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    final double PI = Math.PI;

    public String getInfoKształt() {
        return infoKształt;
    }

    public void setInfoKształt(String infoKształt) {
        this.infoKształt = infoKształt;
    }

    private String infoKształt;



    double lineLength(Line2D line) {

        return super.lineLength(line);
    }

    public double circleArea(Circle circle) {
        return 2 * PI * Math.pow(circle.getrCircle(), 2);
    }

    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getBokA() * rectangle.getBokB();
    }

    public double ballVolume(Ball ball) {
        return 4 / 3 * PI * ball.getrBall();
    }

    public double cubeVolume(Cube cube) {
        return cube.getSideA() * cube.getSideA() * cube.getSideA();
    }

    public double calculate(Shape shape) {
        double calc = 0;

        if (shape instanceof Shape3D) {
            infoKształt = "Objętość ";
            calc = volume(shape);
            return calc;
        }
        if (shape instanceof GeometricShape) {
            infoKształt = "Pole powierzchni ";
            calc = shapeArea((GeometricShape) shape);
            return calc;
        }

        if (shape instanceof Line2D) {
            infoKształt = "Długość ";
            calc = lineLength((Line2D) shape);
        }return calc;
    }

    @Override
    public double volume(Shape shape3D) {
        double volume = 0;

        if (shape3D instanceof Cube) {
            volume = cubeVolume((Cube) shape3D);
            return volume;
        } else if (shape3D instanceof Ball) {
            volume = ballVolume((Ball) shape3D);
        }  return volume;
    }

    @Override
    public double shapeArea(GeometricShape shape) {
        double area = 0;

        if (shape instanceof Circle) {
            area = circleArea((Circle) shape);

            return area;
        } else if (shape instanceof Rectangle) {
            area = rectangleArea((Rectangle) shape);

        } return area;
    }

}
