package org.lessons.java.oop.abstractVehicle;

public abstract class AbstractVehicle {
    // ATTRIBUTI
    protected String brand;
    protected String model;
    protected int powerInHp;
    protected int remainingFuel;

    // COSTRUTTORI
    public AbstractVehicle(String brand, String model, int powerInHp) {
        this.brand = brand;
        this.model = model;
        this.powerInHp = powerInHp;
        this.remainingFuel = 50;
    }

    public AbstractVehicle(String brand, String model, int powerInHp, int remainingFuel) {
        this.brand = brand;
        this.model = model;
        this.powerInHp = powerInHp;
        this.remainingFuel = remainingFuel;
    }

    // GETTER E SETTER
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerInHp() {
        return this.powerInHp;
    }

    public void setPowerInHp(int powerInHp) {
        this.powerInHp = powerInHp;
    }

    public int getRemainingFuel() {
        return this.remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    // METODI AGGIUNTIVI
    public void addFuel(int fuelQuantity) {
        this.remainingFuel += fuelQuantity;
    }

    // METODI ASTRATTI, lascio il compito di riempirlo alle sottoclassi che
    // implementano
    public void start() {
    }

    public void stop() {
    }

}
