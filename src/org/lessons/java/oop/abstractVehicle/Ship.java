package org.lessons.java.oop.abstractVehicle;

public class Ship {
    private String brand;
    private String model;
    private float length;
    private int powerInHp;
    private int remainingFuel;

    // COSTRUTTORI
    public Ship(String brand, String model, float length, int powerInHp) {
        this.brand = brand;
        this.model = model;
        this.length = length;
        this.powerInHp = powerInHp;
        this.remainingFuel = 2000;
    }

    public Ship(String brand, String model, int powerInHp, int remainingFuel) {
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

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
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
    public void start() {
        System.out.println("Ship start");
    }

    public void stop() {
        System.out.println("Ship stop");
    }

    public void addFuel(int fuelQuantity) {
        this.remainingFuel += fuelQuantity;
    }

    public void navigate() {
        System.out.println("Ship navigating");
    }

    public void dock() {
        System.out.println("Ship docking");
    }

}
