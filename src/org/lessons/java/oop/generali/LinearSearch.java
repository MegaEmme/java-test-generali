package org.lessons.java.oop.generali;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // Dato un array di numeri randomici
        // chiedo all'utente se il numero è
        // presente e gli rispondo

        int[] numbers = new int[15];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(50);
            System.out.println(numbers[i]); // verifica se l'array si è riempito
        }

        Scanner scan = new Scanner(System.in);

        scan.close();

        System.out.println("Scrivi il numero da cercare nell'array: ");
        int userNumber = scan.nextInt();

        boolean isNumberFound = false;
        int i = 0;
        while (!isNumberFound && i < numbers.length) {
            // se il numero attuale è uguale a quello inserito
            if (numbers[i] == userNumber) {
                // isNumberFound diventa vero e esco dal ciclo
                isNumberFound = true;
                // altrimenti incremento l'indice
            } else {
                i++;
            }
        }

        // se isNumer Found è true
        if (isNumberFound) {
            System.out.println("Numero trovato all'indice: " + i);
        }
        // altrimenti
        else {
            System.out.println("Il numero non è presente");
        }

    }
}
