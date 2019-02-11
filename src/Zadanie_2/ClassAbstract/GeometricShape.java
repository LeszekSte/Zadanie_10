package Zadanie_2.ClassAbstract;

public abstract class GeometricShape extends Shape2D {


    public GeometricShape(double xPointStart, double yPointStart, double xPointEnd, double yPointEnd) {
        super(xPointStart, yPointStart, xPointEnd, yPointEnd);
    }

    public GeometricShape(double bokA, double bokB) {
        super(bokA, bokB);
    }

    public GeometricShape(double rCircle) {
        super(rCircle);
    }
}
