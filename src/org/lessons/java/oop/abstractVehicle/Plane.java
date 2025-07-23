package org.lessons.java.oop.abstractVehicle;

public class Plane {
    // ATTRIBUTI
    private String brand;
    private String model;
    private int powerInHp;
    private int remainingFuel;

    // COSTRUTTORI
    public Plane(String brand, String model, int powerInHp) {
        this.brand = brand;
        this.model = model;
        this.powerInHp = powerInHp;
        this.remainingFuel = 2000;
    }

    public Plane(String brand, String model, int powerInHp, int remainingFuel) {
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
    public void start() {
        System.out.println("Plane start");
    }

    public void stop() {
        System.out.println("Plane stop");
    }

    public void addFuel(int fuelQuantity) {
        this.remainingFuel += fuelQuantity;
    }

    public void fly() {
        System.out.println("Plane flying");
    }

    public void land() {
        System.out.println("Plane landing");
    }

}
