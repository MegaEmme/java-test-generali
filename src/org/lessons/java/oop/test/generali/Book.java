package org.lessons.java.oop.test.generali;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        String titolo = "I promessi sposi";
        boolean isCopertinaFlessibile = true;
        String autore = "Alessando manzoni";
        float valutazione = 4.5f;
        int numeroDiVoti = 873;
        String sinossi = "\"Una lunga lunga trama\"";
        String isbn = "089776575786X";
        float prezzo;
        int numeroPagine = 696;
        float peso = 460f;
        float altezza = 3.8f;
        float larghezza = 12.6f;
        float lunghezza = 19.5f;

        Scanner in = new Scanner(System.in);
        prezzo = in.nextFloat();

        System.out.println("Il libro intitolato: " + titolo + ", che ha una copertina flessibile: "
                + isCopertinaFlessibile
                + ", scritto da: " + autore + " e valutato da " + numeroDiVoti
                + " persone con una valutazione media di "
                + valutazione + " su 5 stelle, la cui sinossi è: " + sinossi + " e il cui il prezzo è: " + prezzo
                + " e ha " + numeroPagine + " pagine e dimensioni: " + lunghezza + " x " + larghezza + " x " + altezza
                + " cm, pesa inoltre " + peso + " kg, codice ISBN: " + isbn);

        in.close();

    }

}
