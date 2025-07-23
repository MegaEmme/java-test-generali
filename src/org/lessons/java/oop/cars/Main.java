package org.lessons.java.oop.cars;

public class Main {
    public static void main(String[] args) {

        // Definisco un Motore che implemento in Auto (COMPOSIZIONE --> HAS-A)
        Motore motoreCinquecento = new Motore("Motore Fiat 1.2", 1223, 33);
        Motore motoreAlfa = new Motore("Motore Alfa 2.0", 1223, 170);
        Auto cinquecento = new Auto("Fiat", "Cinquecento", "Giallo", 3, motoreCinquecento);
        Auto alfaGiulia = new Auto("Alfa Romeo", "Giulia", "Rosso", 5, motoreAlfa);
        // Qui possiamo vedere l'utilità della COMPOSIZIONE, mettiamo caso che io adesso
        // abbia un'altra macchina della Alfa che ha caratteristiche diverse (colore, hp
        // etc..), ma lo stesso identico motore, dunque:
        Auto AlfaGiulietta = new Auto("Alfa Romeo", "Giulietta", "Gialla", 3, motoreAlfa);

        Auto maiVista = new Auto();

        // cambio il modello delle auto
        System.out.println(cinquecento.getModel());
        // qui richiamo setModel senza parametri --> ()
        // che mi costruisce un auto con i parametri del tipo: senza modello senza
        // colore etc..
        cinquecento.setModel();
        System.out.println(cinquecento.getModel());
        //
        System.out.println(alfaGiulia.getModel());
        //
        System.out.println(AlfaGiulietta.getModel());
        // qui richiamo setModel con parametri --> (model:"la rossa")
        alfaGiulia.setModel("la rossa");
        System.out.println(alfaGiulia.getModel());

        System.out.println(maiVista.getColor());
        // qui richiamo setModel con parametri --> (model:"la nera")
        alfaGiulia.setColor("nera");
        System.out.println(alfaGiulia.getColor());

        // qui richiamo l'attributo "static" numberOfWheels, condiviso tra tutte le
        // auto, il suo ambito di visibilità non può essere "private" poichè è un
        // attributo
        // che esiste fuori dal costruttore, perciò deve poter essere
        // visto
        // al di fuori della sua classe, in questo caso deve essere visbile in tutto il
        // package
        // perciò il suo mdificatore d'accesso dovrà essere "protected", se poi lo
        // voglio modificare
        // devo richiamare il suo METODO STATICO "updateNumberOfWheels(...))"
        //
        // Qua prendo il valore direttamente su "Auto"
        System.out.println(Auto.numberOfWheels);
        //
        //
        // Qua lo prendo sul costrutto "cinquecento" e "alfaGiulia", tuttavia VSCode me
        // lo
        // sottolinea in verde dicendo "guarda che è inutile chiamarlo sui costrutti"
        // basta chiamarlo sulla superClasse Auto:
        // --> System.out.println(cinquecento.numberOfWheels);
        // --> System.out.println(alfaGiulia.numberOfWheels);
        //
        //
        Auto.updateNumberOfWheels(6);
        System.out.println(Auto.numberOfWheels);
        // Adesso tutte le auto avranno 6 ruote perchè
        // I VALORI STATICI SONO CONDIVISI SEMPRE E PER OGNI ELEMENTO A DISPOSIZIONE!
        //
        //
        // Qui ho appena rimosso l'attributo "int hp" dalla classe Auto, poichè dopo
        // aver realizzato il Motore utilizzo il suo valore kw, dunque, se prima era:
        // "System.out.println(cinquecento.getHp());" adesso sarà:
        System.out.println("Kw cinquecento: " + cinquecento.getMotore().getKw());
        // alfaGiulia e allfaGiulietta condividono lo stesso motore avranno dunque lo
        // stesso numero di Kw
        System.out.println("Kw alfaGiulia: " + alfaGiulia.getMotore().getKw());
        System.out.println("Kw alfaGiulietta: " + AlfaGiulietta.getMotore().getKw());
    }
}
