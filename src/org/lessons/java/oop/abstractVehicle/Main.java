package org.lessons.java.oop.abstractVehicle;

import org.lessons.java.oop.abstractVehicle.interfaces.Truckable;

public class Main {
    public static void main(String[] args) {

        // Creo un Auto
        Auto autoAuto = new Auto(null, null, 0, 0);
        // che ha i metodi di Auto:
        // System.out.println(autoAuto.); <-- vedi qua cosa suggerisce come metodi
        // (brand, model, powerInHp, etc..)
        //
        //
        // Creo un AbstracVehicle
        AbstractVehicle veicolo = new Auto(null, null, 0, 0);
        // Che ha gli stessi metodi di Auto (o forse è il contrario?)
        // System.out.println(veicolo.); <-- come Auto
        // Creo un Truckable autoTruckable
        Truckable autoTruckable = new Auto(null, null, 0, 0);
        // che ha i metodi di Truckable:
        // System.out.println(autoTruckable.); <-- vedi qua cosa suggerisce invece
        // (isFragile, isWheeled, etc..)
        //
        //
        // Creo un Truckable barchetta
        Truckable barchetta = new Ship(null, null, 0, 0);
        // Plane non implementa Truckable, quindi la riga sotto darà errore:
        // Truckable aereoGenerico = new Plane(null, null, 0, 0); <-- ERRORE!!!!

    }
}
