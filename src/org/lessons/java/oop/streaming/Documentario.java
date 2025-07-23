package org.lessons.java.oop.streaming;

public class Documentario extends Film {
    // DOCUMENTARIO IS-A FILM - FILM IS-A CONTENUTO
    // (Documentario è contenuto in Film, Film è contenuto in Contenuto
    // --> Documentario è contenuto in Contenuto, in altre parole
    // Documentario erediterà i parametri di film, che
    // a sua volta eredita da contenuto)
    // COSTRUTTORI
    public Documentario(String titolo, int durata) {
        // qua voglio ereditare solo titolo e durata, al posto di cast ci metto new
        // String[]{}
        super(titolo, new String[] {}, durata);
    }

    // METODI AGGIUNTIVI
    // POLIMORFISMO - cambio il messaggio del toString in base alla classe!
    @Override
    public String toString() {
        return String.format("Film Documentario intitolato ''%s'', della durata %d minuti", this.titolo, this.durata);
    }
}
