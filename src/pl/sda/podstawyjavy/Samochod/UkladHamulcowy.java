package pl.sda.podstawyjavy.Samochod;

public class UkladHamulcowy {
    private boolean blockedBrakes = true;                //Wprowadzamy zmienna t/f


    void block() {
        blockedBrakes = true;
    }

    void unlock() {
        blockedBrakes = false;
    }

    boolean check() {                                     //Metoda z void na boolean boma zwracac, a void nie zwraca
        return blockedBrakes;
    }
}
