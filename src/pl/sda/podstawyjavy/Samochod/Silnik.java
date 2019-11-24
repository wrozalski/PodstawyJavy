package pl.sda.podstawyjavy.Samochod;

public class Silnik {
    private String inputEngineType;
    private boolean engineOn = false;
    private long RPM = 0;

    public Silnik(String engineType) {                      //metoda konstruktor pry tworzeniu nowego obiektu i zadaj ajkie dane maja byc
        inputEngineType = engineType;
    }

    String engineType() {
        return inputEngineType;

    }

    void start() {
        RPM = 750;
        engineOn = true;
    }

    void stop() {
        RPM =0;
        engineOn = false;
    }

    boolean isEngineOn() {
        return engineOn;
    }

    void accelerate() {
        if (RPM < 5000) {
            RPM = RPM + 100;
            System.out.println("Zwiększam obroty" + " " + RPM);
        }
    }

    void decelerate() {
        if (RPM > 100) {
            RPM = RPM - 100;
        } else {
            RPM = 0;
        }
    }
}