package pl.sda.podstawyjavy;

public class PodstawyJavy {
    public static void main(String[] Args) {
        //char[] mojaTablica1D = {'h', 'e', 'l', 'l', 'o'};  // Tworzymy tablicę 1D
        //for (int a = 0; a < mojaTablica1D.length; a++) {
        //System.out.print(mojaTablica1D[a]);

        //char[][] mojaTablica2D = {{'h', 'e', 'l', 'l', 'o'}, {'w', 'o', 'r', 'l', 'd'}}; // Tworzymy tablicę 2D
        //for (int a = 0; a < mojaTablica2D.length; a++) {
        //System.out.print(mojaTablica2D[a]);

        int[][] mojaTablicaInt = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};

        // i = 0 to jest pierwsza grupa 123,  i = 1 to jest 345,  i = 2 to jest 678
        // j = 0
        // 123
        // 345
        // 678
        for (int i = 0; i < mojaTablicaInt.length; i++) {
            for (int j = 0; j < mojaTablicaInt[j].length; j++) {
                System.out.println(mojaTablicaInt[i][j]);
            }
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////
        void wydrukujArgumenty (String[]Args){
            for (int i = 0; i < Args.length; i++) {
                System.out.println(Args[i]);
            }
        }
    }

