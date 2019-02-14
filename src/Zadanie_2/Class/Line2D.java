package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.Shape2D;

public class Line2D extends Shape2D {

    private double xPointStart;
    private double yPointStart;
    private double xPointEnd;
    private double yPointEnd;




    public double getxPointStart() {
        return xPointStart;
    }

    public void setxPointStart(double xPointStart) {
        this.xPointStart = xPointStart;
    }

    public double getyPointStart() {
        return yPointStart;
    }

    public void setyPointStart(double yPointStart) {
        this.yPointStart = yPointStart;
    }

    public double getxPointEnd() {
        return xPointEnd;
    }

    public void setxPointEnd(double xPointEnd) {
        this.xPointEnd = xPointEnd;
    }

    public double getyPointEnd() {
        return yPointEnd;
    }

    public void setyPointEnd(double yPointEnd) {
        this.yPointEnd = yPointEnd;
    }

    public Line2D(double xPointStart, double yPointStart, double xPointEnd, double yPointEnd) {
        this.xPointStart = xPointStart;
        this.yPointStart = yPointStart;
        this.xPointEnd = xPointEnd;
        this.yPointEnd = yPointEnd;
    }

    @Override
    public String toString() {
        return "Odcinek wyznaczony przez współrzędne " +
                "[" + xPointStart + "," + yPointStart +
                "][" + xPointEnd +"," + yPointEnd +"]";
    }
}