package org.lessons.java.oop.tests.generali;

public class Intro {
    public static void main(String[] args) {

        String[] arrayStudenti = { "Gina", "Gino", "Nina", "Nino" };
        // System.out.println(arrayStudenti[1]);

        // arrayStudenti[2] = "Ninetta";
        // System.out.println(arrayStudenti[2]);

        // Stessa cosa con due cicli diversi:
        // 1) ciclo for
        // for (int i = 0; i < arrayStudenti.length; i++) {
        // System.out.println(arrayStudenti[i]);
        // }

        // 2) ciclo while
        int i = 0;
        while (i < arrayStudenti.length) {
            System.out.println(arrayStudenti[i]);
            i++;
        }

    }
}
