package pl.sda.podstawyjavy;

import java.util.Scanner;

public class KomunikatyDlaLiczb {
    int liczba = -1;                                       // zmienna liczba na poziomie klasy

    void przyjmijLiczbe() {
        boolean poprawnaWartosc = false;
        Scanner wpiszLiczbe = new Scanner(System.in);
        while (poprawnaWartosc == false) {
            System.out.println("Podaj liczbę od 0 do 9");
            liczba = wpiszLiczbe.nextInt();                // wywolujemy ja
            if (liczba >= 0 && liczba <= 9) {
                poprawnaWartosc = true;
                if (liczba == 3) {
                    System.out.println("Dzień dobry");
                } else if (liczba == 5) {
                    System.out.println("Dzień dobry");
                } else {
                    System.out.println("Standardowa wiadomość");
                }
            } else {
                System.out.println("Podana wartość jest nieprawidlowa");
            }
        }
    }

    int pobierzOstatniaWartoscLiczby() {
        return liczba;                                                    //
    }

}
