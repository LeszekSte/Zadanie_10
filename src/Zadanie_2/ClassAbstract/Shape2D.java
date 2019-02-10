package Zadanie_2.ClassAbstract;

public abstract class Shape2D {

    private double rCircle;

    private double xPointStart;
    private double yPointStart;
    private double xPointEnd;
    private double yPointEnd;


    public Shape2D(double xPointStart, double yPointStart, double xPointEnd, double yPointEnd) {
        this.xPointStart = xPointStart;
        this.yPointStart = yPointStart;
        this.xPointEnd = xPointEnd;
        this.yPointEnd = yPointEnd;
    }

    public Shape2D(double rCircle) {
        this.rCircle = rCircle;
    }
    
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

    public double getrCircle() {
        return rCircle;
    }

    public void setrCircle(double rCircle) {
        this.rCircle = rCircle;
    }
}

