package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.Shape2D;

public class Line2D extends Shape2D {
    private double lineLenght;

    public Line2D(double xPointStart, double yPointStart, double xPointEnd, double yPointEnd) {
        super(xPointStart, yPointStart, xPointEnd, yPointEnd);
    }

    public double getLineLenght() {
        return lineLenght;
    }

    public void setLineLenght(double lineLenght) {
        this.lineLenght = lineLenght;
    }

    @Override
    public String toString() {
        return "Line2D{ [" + getxPointStart() + "," + getyPointStart() + "][" +
                +getxPointEnd() + "," + getyPointStart() + "] ";

    }
}

