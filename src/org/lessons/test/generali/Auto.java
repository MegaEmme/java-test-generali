package org.lessons.test.generali;

public class Auto {

    // caratteristiche tipiche ==> ATTRIBUTI - fields - campi - quello che sà
    public String brand;
    public String model;
    public String color;
    public int hp;
    public int numberOfDoors;
    public boolean hasStarted;
    public boolean inWorkshop;

    // COSTRUTTORE
    public Auto(String brand, String model, String color, int hp, int numberOfDoors) {
        // tutte le info necessarie ad inizializzare la nostra istanza (il nostro
        // oggetto)
        this.brand = brand; // ATTENZIONE IMPORTANTISSIMO
        this.model = model; // "this.model" è quello a riga 7. "model" invece è quello a riga 16
        this.color = color; // cosi per tutti i valori ("this" si riferisce agli attributi e l'altro
        this.hp = hp; // all'argomento del costruttore)
        this.numberOfDoors = numberOfDoors;
        this.hasStarted = false; // mentre "hasStarted" e "inWorkshop" (che non sono presenti come parametri
        this.inWorkshop = false; // nel costruttore) le inizializzo direttamente qua dentro

    }

    // capacità tipiche ==> METODI - quello che può fare
    public void startUp() {
        this.hasStarted = true;
    }

    public void turnOff() {
        hasStarted = false;
    }

    public void changeHp(int hp) {
        this.hp = hp;
    }
}
