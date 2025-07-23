package org.lessons.java.oop.abstractVehicle;

public class Auto extends AbstractVehicle {
    // ATTRIBUTI
    private int numberOfWheels;

    // COSTRUTTORI
    public Auto(String brand, String model, int powerInHp, int numberOfWheels) {
        super(brand, model, powerInHp);
        this.numberOfWheels = numberOfWheels;
    }

    public Auto(String brand, String model, int powerInHp, int remainingFuel, int numberOfWheels) {
        super(brand, model, powerInHp, remainingFuel);
        this.numberOfWheels = numberOfWheels;
    }

    // GETTER E SETTER
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    // METODI AGGIUNTIVI
    // Override del METODO ASTRATTO creato in AbstractVehicle
    @Override
    public void start() {
        System.out.println("Car start");
    }

    // Override del METODO ASTRATTO creato in AbstractVehicle
    @Override
    public void stop() {
        System.out.println("Car stop");
    }

}
