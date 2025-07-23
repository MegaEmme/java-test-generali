package org.lessons.java.oop.abstractVehicle;

import org.lessons.java.oop.abstractVehicle.interfaces.Truckable;

public class Ship extends AbstractVehicle implements Truckable {
    private float length;

    // COSTRUTTORI
    public Ship(String brand, String model, float length, int powerInHp) {
        super(brand, model, powerInHp);
        this.length = length;
    }

    public Ship(String brand, String model, float length, int powerInHp, int remainingFuel) {
        super(brand, model, powerInHp, remainingFuel);
        this.length = length;
    }

    // GETTER E SETTER
    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    // METODI AGGIUNTIVI
    // Override del METODO ASTRATTO creato in AbstractVehicle
    @Override
    public void start() {
        System.out.println("Ship start");
    }

    // Override del METODO ASTRATTO creato in AbstractVehicle
    @Override
    public void stop() {
        System.out.println("Ship stop");
    }

    public void navigate() {
        System.out.println("Ship navigating");
    }

    public void dock() {
        System.out.println("Ship docking");
    }

    // Metodi importati con Quick fix su Ship (" Ctrl + , " --> implement methods)
    @Override
    public float getShippableWeight() {
        return 6000f;
    }

    @Override
    public float getShippableLength() {
        return 8f;
    }

    @Override
    public float getShippableWidth() {
        return 4.5f;
    }

    @Override
    public float getShippableHeight() {
        return 4f;
    }

    @Override
    public boolean isFragile() {
        return true;
    }

    @Override
    public boolean isWheeled() {
        return false;
    }

}
