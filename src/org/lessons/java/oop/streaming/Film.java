package org.lessons.java.oop.streaming;

public class Film extends Contenuto {
    // FILM IS-A CONTENUTO MA NON VICEVERSA
    // ATTRIBUTI
    protected String[] cast;
    protected int durata;

    // COSTRUTTORI
    public Film(String titolo, String[] cast, int durata) {
        super(titolo);
        this.cast = cast;
        this.durata = durata;
    }

    // GETTER E SETTER
    public String[] getCast() {
        return this.cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public int getDurata() {
        return this.durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    // METODI AGGIUNTIVI
}
