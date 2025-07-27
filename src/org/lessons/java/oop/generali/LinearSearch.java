package org.lessons.java.oop.generali;

import java.util.Random;
import java.util.Scanner;
// VERSIONE BASE
//
//
// public class LinearSearch {
//     public static void main(String[] args) {
//         // Dato un array di numeri randomici
//         // chiedo all'utente se il numero è
//         // presente e gli rispondo

//         int[] numbers = new int[15];
//         Random rand = new Random();

//         for (int i = 0; i < numbers.length; i++) {
//             numbers[i] = rand.nextInt(50);
//             System.out.println(numbers[i]); // verifica se l'array si è riempito
//         }

//         Scanner scan = new Scanner(System.in);

//         System.out.println("Scrivi il numero da cercare nell'array: ");
//         int userNumber = scan.nextInt();

//         scan.close();

//         boolean isNumberFound = false;
//         int i = 0;
//         while (!isNumberFound && i < numbers.length) {
//             // se il numero attuale è uguale a quello inserito
//             if (numbers[i] == userNumber) {
//                 // isNumberFound diventa vero e esco dal ciclo
//                 isNumberFound = true;
//                 // altrimenti incremento l'indice
//             } else {
//                 i++;
//             }
//         }

//         // se isNumberFound è true
//         if (isNumberFound) {
//             System.out.println("Numero trovato all'indice: " + i);
//         }
//         // altrimenti
//         else {
//             System.out.println("Il numero non è presente");
//         }

//     }
// }
//
//
// VERSIONE CON DEBUGGING
// (Cosa succede in un ciclo for? e in un ciclo while?)
// aggiungo due breakpoint, uno a ln.69 per il ciclo for e uno a 
// ln. 87 per il ciclo while
public class LinearSearch {
    public static void main(String[] args) {
        // Dato un array di numeri randomici
        // chiedo all'utente se il numero è
        // presente e gli rispondo

        int[] numbers = new int[15];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(50);
            // DEBUG: il breakpoint mi analizza il random e continuando la sua esecuzione
            // (CONTINUE e poi premo F10 finche non finisco)
            // alla fine mi popola l'array passo passo aumentando l'indice i a ogni giro e
            // mostrando i risultati ottenuti per quell'indice (il breakpoint cicla)
            System.out.println(numbers[i]); // verifica se l'array si è riempito
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Scrivi il numero da cercare nell'array: ");
        int userNumber = scan.nextInt();
        scan.close();

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
            // DEBUG: Qua il debug mi cicla sul while tante volte quante richieste dalla
            // condizione, aumentando ad ogni iterazione l'indice (quindi finche la
            // condizione non diventa true passa dal while all'else), dopodiche, quando la
            // condizione del while è rispettata, solo allora entro nel ciclo if
        }

        // se isNumberFound è true
        if (isNumberFound) {
            System.out.println("Numero trovato all'indice: " + i);
        }
        // altrimenti
        else {
            System.out.println("Il numero non è presente");
        }

    }
}
