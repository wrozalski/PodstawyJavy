package pl.sda.podstawyjavy.Samochod;

public class Samochod {

    private Silnik engine;
    private UkladHamulcowy ukladHamulcowy = new UkladHamulcowy();

    private int mileageCounter = 0;

    private String model;
    private String make;
    private String kolor;

    public Samochod(String engineType, String model, String make, String kolor) {                           //Konstruktor dla Samochod
        engine = new Silnik(engineType);
        this.model = model;
        this.make = make;
        this.kolor = kolor;
    }

    public void drive() {
        ukladHamulcowy.unlock();
        engine.start();
        engine.accelerate();
        mileageCounter++;
    }

    public void stop() {
        engine.stop();
        ukladHamulcowy.block();
    }

    public String makeModel() {
        return model + " " + make + " " + kolor;
    }


    public int currentMileage() {
        return mileageCounter;
    }

    public String getColour() {
        return kolor;
    }

}
