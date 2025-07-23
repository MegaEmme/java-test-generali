package org.lessons.java.oop.abstractVehicle;

import org.lessons.java.oop.abstractVehicle.interfaces.Truckable;

public class Auto extends AbstractVehicle implements Truckable {
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

    // Metodi importati con Quick fix su Auto (" Ctrl + , " --> implement methods)
    @Override
    public float getShippableWeight() {
        return 2000f;
    }

    @Override
    public float getShippableLength() {
        return 4f;
    }

    @Override
    public float getShippableWidth() {
        return 2.6f;
    }

    @Override
    public float getShippableHeight() {
        return 1.6f;
    }

    @Override
    public boolean isFragile() {
        return false;
    }

    @Override
    public boolean isWheeled() {
        return true;
    }

}
