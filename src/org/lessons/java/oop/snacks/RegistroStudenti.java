package org.lessons.java.oop.snacks;

public class RegistroStudenti {
    // ATTRIBUTI
    private Studente[] registro;
    private int numeroStudentiAggiunti = 0;

    // COSTRUTTORI
    public RegistroStudenti() {
        this.registro = new Studente[100];
    }

    // qua in realtà è sbagliato, la richiesta è inizializzare il registro vuoto
    // (cioe this.registro = new Studente[0];) per poi crearne una copia della
    // stessa lunghezza + 1, cioè:
    //
    // public void addStudente(Studente studente) {
    // creo un nuovo registro lungo come quello di prima +1 -->
    // Studente[] registroAggiornato = new Studente[this.registro.length + 1];
    // copio il vecchio registro nel nuovo -->
    // for (int i = 0; i < registro.length; i++) {
    // this.registro[i] = registroAggiornato[i];
    // aggiingo all'ultimo posto lo studente -->
    // registroAggiornato[registro.length - 1] = studente;
    // sovrascrivo registro con registroAggiornato -->
    // this.registro = registroAggiornato;
    // }
    // }
    //
    //

    // METODI
    public void AggiungiStudente(Studente nuovoStudente) {
        if (numeroStudentiAggiunti <= registro.length) {
            this.registro[numeroStudentiAggiunti] = nuovoStudente;
            numeroStudentiAggiunti++;
            System.out.println("Aggiunto nuovo studente: " + nuovoStudente.NomeCognomeEta());
        } else {
            System.out.println("Spazio esaurito");
        }
    }

    public void StampaRegistro() {

        if (numeroStudentiAggiunti == 0) {
            System.out.println("Registro vuoto");
        } else {
            System.out.println("Lista Studenti registrati, tot.(" + numeroStudentiAggiunti + ")");
            for (int i = 0; i < numeroStudentiAggiunti; i++) {
                Studente studenteAttuale = registro[i];
                System.out.println("Studente numero " + (i + 1) + "\nNome: " + studenteAttuale.getNome() + "\nCognome: "
                        + studenteAttuale.getCognome() + "\nEtà: " + studenteAttuale.getEta());
            }
        }
    }
}
