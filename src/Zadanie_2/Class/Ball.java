package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.Shape3D;

public class Ball extends Shape3D {

        private double rBall;

        public Ball(double rBall) {
                this.rBall = rBall;
        }


        public double getrBall() {
                return rBall;
        }

        public void setrBall(double rBall) {
                this.rBall = rBall;
        }

        @Override
        public String toString() {
                return "Ball{" +
                        "rBall=" + rBall +
                        '}';
        }
}
