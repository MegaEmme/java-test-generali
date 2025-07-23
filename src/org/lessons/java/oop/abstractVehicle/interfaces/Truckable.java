package org.lessons.java.oop.abstractVehicle.interfaces;

public interface Truckable {

    // INTERFACCE
    // Non posso avere variabili di istanza ma solo metodi astratti
    // che poi verranno popolati dallle classi con cui interagisco
    // Stiamo creando un'interfaccia che dice se un oggetto è trasportabile
    // via terra, dunque ci aspettiamo che chi implementa questa interfaccia
    // sia obbligato a realizzare un metodo che mi restituisce le informazioni
    // che voglio, per esempio in questo caso potremmo voler conoscere
    // peso, dimensioni (lunghezza, larghezza, altezza), se è fragile o
    // anche se ha delle ruote, dunque creo i segurenti metodi astratti:
    float getShippableWeight();

    float getShippableLength();

    float getShippableWidth();

    float getShippableHeight();

    boolean isFragile();

    boolean isWheeled();

}
