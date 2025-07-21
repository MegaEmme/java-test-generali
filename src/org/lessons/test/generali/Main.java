package org.lessons.test.generali;

public class Main {
    public static void main(String[] args) {

        Auto cinquecento = new Auto("Fiat", "Cinquecento", "Giallo", 40, 3);
        Auto alfaGiulia = new Auto("Alfa Rome", "Giulia", "Rosso", 180, 5);

        // Prima di introdurre i costruttori avremmo fatto cosi:
        // cinquecento.brand = "Fiat";
        // cinquecento.model = "Cinquecento";
        // cinquecento.color = "Giallo";
        // cinquecento.hp = 40;
        // cinquecento.numberOfDoors = 3;

        // alfaGiulia.brand = "Alfa Romeo";
        // alfaGiulia.model = "Giulia";
        // alfaGiulia.color = "Rosso";
        // alfaGiulia.hp = 180;
        // alfaGiulia.numberOfDoors = 5;

        System.out.println(cinquecento.model);
        System.out.println(cinquecento.hp);
        System.out.println(alfaGiulia.model);
        System.out.println(alfaGiulia.hp);

        cinquecento.changeHp(55);

        System.out.println("Hai cambiato gli hp di: " + cinquecento.model + ".\nNuovo valore: " + cinquecento.hp);

    }
}
