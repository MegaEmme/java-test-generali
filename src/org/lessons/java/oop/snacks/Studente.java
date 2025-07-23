package org.lessons.java.oop.snacks;

public class Studente {

    // ATTRIBUTI
    private String nome;
    private String cognome;
    private int eta;

    // COSTRUTTORI
    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    // GETTER E SETTER
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return this.eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    // METODI AGGIUNTIVI

    public String NomeCognomeEta() {
        return this.nome + " " + this.cognome + ", " + this.eta;
    }

    // metodo uguale alternativo BEST PRACTICE
    @Override
    public String toString() {
        return String.format("%s %s %d", this.nome, this.cognome, this.eta);
    }

}
