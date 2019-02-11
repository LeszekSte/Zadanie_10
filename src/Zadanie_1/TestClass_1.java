package Zadanie_1;

public class TestClass_1 {

    static Towar[] towars = new Towar[3];
    static int quantity =0;

    public static void main(String[] args) {

        Magazyn magazyn = new Magazyn();
        magazyn.nowyTowar();
        quantity++;
        do {
            do {
                magazyn.nowyTowar();
            } while (magazyn.inOnMagazine(towars, quantity));
        } while (quantity < towars.length);
        magazyn.toString();
    }
}



