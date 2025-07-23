package org.lessons.java.oop.abstractVehicle;

public class Ship extends AbstractVehicle {
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

}
