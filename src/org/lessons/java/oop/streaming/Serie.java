package org.lessons.java.oop.streaming;

public class Serie extends Contenuto {
    protected String[] cast;
    protected String[] episodi;

    public Serie(String titolo, String[] cast, String[] episodi) {
        super(titolo);
        this.cast = cast;
        this.episodi = episodi;
    }

}
