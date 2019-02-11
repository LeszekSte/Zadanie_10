package Zadanie_2.Class;

import Zadanie_2.ClassAbstract.Shape3D;

public class Ball extends Shape3D {

        private double rBall;

        public Ball(double rCube) {
                this.rBall = rCube;
        }


        public double getrBall() {
                return rBall;
        }

        public void setrBall(double rCube) {
                this.rBall = rCube;
        }

        @Override
        public String toString() {
                return "Ball{" +
                        "rBall=" + rBall +
                        '}';
        }
}
