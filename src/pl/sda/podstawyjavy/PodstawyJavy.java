package pl.sda.podstawyjavy;

public class PodstawyJavy {
    // sout tab
    public static void main(String [] Args) { //Zmienna Args definiowana w ustawieniach Edit Configurations
        System.out.println("Hello, World");
        //System.out.println(Args[0]);
        //System.out.println(Args[1]);

        //Pętla
        for(int i = 0; i<Args.length; i++) {
            System.out.println(Args[i]);
        }



    }

}
