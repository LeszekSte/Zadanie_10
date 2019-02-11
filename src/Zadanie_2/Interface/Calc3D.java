package Zadanie_2.Interface;

import Zadanie_2.Class.Ball;
import Zadanie_2.Class.Cube;
import Zadanie_2.ClassAbstract.Shape3D;

public interface Calc3D {
    double ballVolume(Ball ball);
    double cubeVolume(Cube cube);

    double volume (Shape3D shape3D);
}
