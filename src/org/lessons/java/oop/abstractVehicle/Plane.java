package org.lessons.java.oop.abstractVehicle;

public class Plane extends AbstractVehicle {
    // ATTRIBUTI
    private int numberOfEngines;

    // COSTRUTTORI
    public Plane(String brand, String model, int powerInHp, int numberOfEngines) {
        super(brand, model, powerInHp);
        this.numberOfEngines = numberOfEngines;
    }

    public Plane(String brand, String model, int powerInHp, int remainingFuel, int numberOfEngines) {
        super(brand, model, powerInHp, remainingFuel);
        this.numberOfEngines = numberOfEngines;
    }

    // GETTER E SETTER
    public int getNumberOfEngines() {
        return this.numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    // METODI AGGIUNTIVI
    @Override
    public void start() {
        System.out.println("Plane start");
    }

    @Override
    public void stop() {
        System.out.println("Plane stop");
    }

    public void fly() {
        System.out.println("Plane flying");
    }

    public void land() {
        System.out.println("Plane landing");
    }

}
