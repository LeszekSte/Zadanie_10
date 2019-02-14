package Zadanie_2.Class;

public class LineCalc {

    double lineLength(Line2D line) {
        double x = line.getxPointEnd() - line.getxPointStart();
        double y = line.getyPointEnd() - line.getyPointStart();

        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

}
