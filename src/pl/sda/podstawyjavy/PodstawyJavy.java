package pl.sda.podstawyjavy;

public class PodstawyJavy {
    public static void main(String[] Args) {
        //char[] mojaTablica1D = {'h', 'e', 'l', 'l', 'o'};  // Tworzymy tablicę 1D
        //for (int a = 0; a < mojaTablica1D.length; a++) {
        //System.out.print(mojaTablica1D[a]);

        char[][] mojaTablica2D = {{'h', 'e', 'l', 'l', 'o'}, {'w', 'o', 'r', 'l', 'd'}}; // Tworzymy tablicę 2D
        for (int a = 0; a < mojaTablica2D.length; a++) {
            System.out.print(mojaTablica2D[a]);
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////
    void wydrukujArgumenty(String[] Args) {
        for (int i = 0; i < Args.length; i++) {
            System.out.println(Args[i]);
        }
    }
}

