package org.lessons.java.oop.streaming;

public class Serie extends Contenuto {
    // SERIE IS-A CONTENUTO MA NON VICEVERSA
    protected String[] cast;
    protected String[] episodi;

    public Serie(String titolo, String[] cast, String[] episodi) {
        // SUPER richiama il cotruttore del padre:
        //
        // public Contenuto(String titolo) {
        // this.titolo = titolo;
        // }
        //
        // va comunque messo come parametro (ln 7)
        // oltre che come attributo qui sotto (ln 16)
        super(titolo);
        this.cast = cast;
        this.episodi = episodi;
    }

    // GETTER E SETTER
    public String[] getCast() {
        return this.cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public String[] getEpisodi() {
        return this.episodi;
    }

    public void setEpisodi(String[] episodi) {
        this.episodi = episodi;
    }

    // METODI AGGIUNTIVI
    // POLIMORFISMO - cambio il messaggio del toString in base alla classe!
    @Override
    public String toString() {
        return String.format("Serie TV intitolata ''%s'', con %d attori e %d episodi", this.titolo, this.cast.length,
                this.episodi.length);
    }

    // POLIMORFISMO - personalizzo il metodo riproduci()
    @Override
    public String riproduci() {
        return String.format("Stai riproducendo un episodio della serie %s", this.titolo);
    }

}
