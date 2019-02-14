package Zadanie_1;

import java.util.Scanner;

import static Zadanie_1.TestClass_1.quantity;
import static Zadanie_1.TestClass_1.towars;

public class Magazyn {

    static Scanner sc = new Scanner(System.in);

    void nowyTowar(int pozycja) {
        System.out.println("Podaj nazwę i id towaru " + (quantity+1));
        System.out.println("Nazwa towaru");
        String name = sc.nextLine();
        System.out.println("Podaj Symbol towaru");
        int id = sc.nextInt();
        sc.nextLine();
        inOnMagazine1(name,id, pozycja);
        //towars[quantity] = new Towar(name, id);
    }

  boolean inOnMagazine1(String name, int id , int pozycja){
        for (int i = 0; i < pozycja; i++) {
            if ( (towars[pozycja].getName().equals(name) )&& (towars[pozycja].getId()==id)) {
                System.out.println("W magazynie już jest taki towar " + towars[i].toString());
                return true;
            }
        }
        quantity++;
        return false;
    }

    boolean inOnMagazine(Towar[] towars, int pozycja) {
        for (int i = 0; i < pozycja; i++) {
            if (towars[pozycja].equals(towars[i])) {
                System.out.println("W magazynie już jest taki towar " + towars[i].toString());
                return true;
            }
        }
        quantity++;
        return false;
    }

    @Override
    public String toString() {
        for (Towar towar : towars) {
            System.out.println("nazwa " + towar.getName()
                    + ", \tId " +towar.getId() );
        }
        return "";
    }
}
