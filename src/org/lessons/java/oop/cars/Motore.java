package org.lessons.java.oop.cars;

//APPROFONDIMENTO COMPOSIZIONE >>>>>>(HAS-A)<<<<<<<
public class Motore {
    // ATTRIBUTI
    private String nome;
    private int volume;
    private int kw;

    // COSTRUTTORI
    public Motore(String nome, int volume, int kw) {
        this.nome = nome;
        this.volume = volume;
        this.kw = kw;
    }

    // GETTER E SETTER
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getKw() {
        return this.kw;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }

    // METODI AGGIUNTIVI

}
