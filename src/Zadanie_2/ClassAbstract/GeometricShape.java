package Zadanie_2.ClassAbstract;

public abstract class GeometricShape extends Shape2D {


    public GeometricShape(double xPointStart, double yPointStart, double xPointEnd, double yPointEnd) {
        super(xPointStart, yPointStart, xPointEnd, yPointEnd);
    }

    public GeometricShape() {
        super();
    }
}
