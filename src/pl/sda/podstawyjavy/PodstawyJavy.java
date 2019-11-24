package pl.sda.podstawyjavy;

import java.util.Scanner;

public class PodstawyJavy {

    public static void main(String[] Args) {

        boolean poprawnaWartosc = false;               // boolean dajemy zeby miec podstawe przrewania petli
        Scanner wpiszLiczbe = new Scanner(System.in);  // petle while piszemy poskanerze zeby go nie tworzyc

        while (poprawnaWartosc == false) {
            System.out.println("Podaj liczbę od 0 do 9");
            int liczba = wpiszLiczbe.nextInt();           // Liczba z klawiatury nazwana jako argument int
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
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //char[] mojaTablica1D = {'h', 'e', 'l', 'l', 'o'};
    //for (int a = 0; a < mojaTablica1D.length; a++) {
    //System.out.print(mojaTablica1D[a]);
    //}

    ///////////////////////SPRAWDZANIE ROKU URODZENIA/////////////////////////////////////////////////////////////

        /*
        int YOB = 1981;
        if (YOB < 1980) {
            System.out.println("Rok poniżej 1980");
        } else if (YOB > 1990) {
            System.out.println("Rok powyżej 1990");
        } else {
            System.out.println("Rok pomiędzy 1980 a 1990");
        }
        */
/////////////////////////////////////////////Trójargumentowy operator, wynikiem jest println/////////////////////////
       /*
        int YOB = 1980;
        String powitanie = (YOB==1980) ?
                "Urodzony w 1980 roku":
                "Nie urodziłeś się w 1980";
        System.out.println(powitanie);
       */

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
    char[][] mojaTablica2D = {{'h', 'e', 'l', 'l', 'o'}, {'w', 'o', 'r', 'l', 'd'}}; // Tworzymy tablicę 2D
        for(int b = 0; b<mojaTablica2D.length; b++) {
        System.out.print(mojaTablica2D[b]);
    }

        int[][] mojaTablicaInt = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        // i = 0 to jest pierwsza grupa 123,  i = 1 to jest 345,  i = 2 to jest 678
        // j = 0 to jest pierwsza kolumna 136,  i = 1 to jest 247,  i = 2 to jest 358
        // 123
        // 345
        // 678
        for (int i = 0; i < mojaTablicaInt.length; i++) {
            for (int j = 0; j < mojaTablicaInt[i].length; j++) {   // mojaTablicaInt[i] kolumny 123
                System.out.println(mojaTablicaInt[i][j]);
            }
        }
        // Integer mojeZamowienie = Integer.getInteger("33");  // Integer ze stringa " "
        /*int i = 0
        System.out.println(i);   //0 wartość i przed rozpoczęciem działań
        System.out.println(++i); //1 zwiekszylismy wart i przed wykonaniem kodu
        System.out.println(i);
        System.out.println(i++); //1 zwiększamy wart zmiennej PO WYKONANIU kodu czyli i nadal 1
        System.out.println(i);   //2 drukuje bieżącą wart zmiennej
        */
////////////////////////////////////////////////////////////////////////////////////////////////////
    void wydrukujArgumenty(String[] Args) {
        for (int kkk = 0; kkk < Args.length; kkk++) {
            System.out.println(Args[kkk]);
        }
    }
}