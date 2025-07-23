package org.lessons.java.oop.streaming;

//CONCETTO DI EREDITARIETA'  >>>>>>>(IS-A)<<<<<<<
public class Contenuto {
    // ATTRIBUTI
    protected String titolo;

    // COSTRUTTORI
    public Contenuto(String titolo) {
        this.titolo = titolo;
    }

    // GETTER E SETTER
    public String getTitolo() {
        return this.titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    // METODI AGGIUNTIVI

    public String riproduci() {
        // "String.format" è un modo per scrivere tutto dentro gli apici e attraverso
        // l'utilizzo del % seguito da uno "specificatore di formato":
        //
        // %s --> stringhe
        //
        // %d --> intero [(%5d) --> stampa un intero con larghezza minima 5 caratteri,
        // se fosse piu corto verranno aggiunti SPAZI all'inizio; (%-5d) --> mette gli
        // spazi alla fine anziche l'inizio; (%05d) --> mette ZERI anziche spazi vuoti]
        //
        // %f --> float o double (%.2f --> stampa un decimale con due cifre dopo la
        // virgola)
        //
        // %b --> boolean [String.format("E' vero? %b", true) --> "E' vero? true")]
        //
        // %n --> nuova riga, equivale a "...+ \n +..."
        return String.format("Sto riproducendo: %s", this.titolo);
    }
}
