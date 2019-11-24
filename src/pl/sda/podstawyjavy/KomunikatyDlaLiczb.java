package pl.sda.podstawyjavy;

import java.util.Scanner;

class KomunikatyDlaLiczb {
    private int liczba = -1;                                       // zmienna liczba na poziomie klasy ustawiona taka żeby nie wykonała metody

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
        return liczba;
    }

    // Metoda do zmiany wartosci zmiennej prywatanej liczba oraz jej sprawdzenie
    void ustawWartoscZmiennejLiczba(int nowaWartoscLiczby) {
        if (nowaWartoscLiczby >= 0 && nowaWartoscLiczby <= 9) {
            liczba = nowaWartoscLiczby;
        } else {
            System.out.println("Nowa wartość jest nieprawidłowa");
        }
    }

    void ustawWartosciZmiennejLiczba(int... liczby) {

        for (int argument : liczby) {
            if (argument >= 0 && argument <= 9) {
                liczba = argument;
                break;
            }
        }
    }
}