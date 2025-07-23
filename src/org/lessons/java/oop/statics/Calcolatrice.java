package org.lessons.java.oop.statics;

//ATTRIBUTI E METODI STATICI
//Sono indipendenti dalle istanze (oggetti) [come la specie:"mammifero" di un gatto, è indipendente dal gatto in se]
public class Calcolatrice {
    // Riccardo in questo esempio utilizza "static int", io ho messo String per
    // poter ritornare un
    // messaggio verbale oltre al semplice risultato dell'operazione
    public static String somma(int addendo, int addizionando) {
        return "La somma di " + addendo + " più " + addizionando + " è uguale a " + (addendo + addizionando);
    }

    public static String moltiplica(int moltiplicando, int moltiplicatore) {
        return "Il prodotto di " + moltiplicando + " per " + moltiplicatore + " è uguale a "
                + (moltiplicando * moltiplicatore);
    }
}
