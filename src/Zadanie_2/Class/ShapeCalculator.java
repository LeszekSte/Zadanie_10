package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.GeometricShape;
import Zadanie_2.ClassAbstract.Shape3D;
import Zadanie_2.Interface.Calc2D;
import Zadanie_2.Interface.Calc3D;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    double lineLength(Line2D line) {
        return super.lineLength(line);
    }


    public double circleArea(GeometricShape circle) {
        return 2 * PI * Math.pow(circle.getrCircle(), 2);
    }


    public double rectangleArea(GeometricShape rectangle) {
        return rectangle.getBokA() * rectangle.getBokB();
    }

    public double circleArea(Circle circle) {
        return 2 * PI * Math.pow(circle.getrCircle(), 2);
    }


    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getBokA() * rectangle.getBokB();
    }


    @Override
    public double ballVolume(Ball ball) {
        return 4 / 3 * PI * ball.getrBall();
    }

    @Override
    public double cubeVolume(Cube cube) {
        return cube.getSideA() * cube.getSideB() * cube.getSideC();
    }

    @Override
    public double volume(Shape3D shape3D) {
        double volume = 0;
        if (shape3D instanceof Cube) {
            volume = cubeVolume((Cube) shape3D);
        } else if (shape3D instanceof Ball)
            volume = ballVolume((Ball) shape3D);
        return volume;
    }

    @Override
    public double shapeArea(GeometricShape geometricShape) {

        double area = 0;
        if (geometricShape instanceof Circle) {
            area = circleArea(geometricShape);
        } else if (geometricShape instanceof Rectangle)
            area = rectangleArea(geometricShape);
        return area;
    }
}
