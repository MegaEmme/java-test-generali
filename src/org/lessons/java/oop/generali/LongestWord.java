package org.lessons.java.oop.generali;

import java.util.Scanner;

// VERSIONE BASE
//
//
// public class LongestWord {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);

// System.out.println("Parola Uno: ");
// String parolaUno = scan.nextLine();

// System.out.println("Parola Due: ");
// String parolaDue = scan.nextLine();

// if (parolaUno.length() > parolaDue.length()) {
// System.out.println("Parola uno più lunga");
// } else if (parolaDue.length() > parolaUno.length()) {
// System.out.println("Parola due più lunga");
// } else {
// System.out.println("Lunghe uguale");
// }

// scan.close();
// }
// }
//
//
// VERSIONE CON DEBUGGING:
//
//
public class LongestWord {
    public static void main(String[] args) {
        // Debugging: possiamo aggungere dei breakpoint cliccando sul pallino rosso che
        // compare quando passiamo il mouse accanto al numero della linea (a sx),
        // cliccandoci (diventa rosso acceso) impostiamo l'inizio del punto di debug
        // BREAKPOINT: punto in cui inizia la mia analisi (fotografia) in caso di debug,
        // iniziamo per esempio a vedere che succede sul mio scan.close(),
        // imposto un breakpoint su quella linea (ln.51) e clicco debug (tra ln.34 e
        // 35):
        Scanner scan = new Scanner(System.in);

        System.out.println("Parola Uno: ");
        String parolaUno = scan.nextLine();

        System.out.println("Parola Due: ");
        String parolaDue = scan.nextLine();

        scan.close();

        // A questo punto visualizzo le informazioni sulla sx nella colonna debug e
        // nella barra in alto a dx, da cui posso fare:
        //
        // STEP INTO:
        // però clicco su "STEP INTO" vedo cosa succede all'interno del processo che sto
        // debuggando, cioè entro nel cuore della classe a cui si riferisce
        // quella linea (in questo caso la class String), da qui premendo il tasto F10
        // vado avanti e posso scrutare tutto ciò che succede
        //
        // CONTINUE:
        // per continuare invece l'esecuzione dopo essersi fermati al
        // breakpoint dovrò cliccare "CONTINUE" sulla piccola barra di debug che compare
        // in alto (quella col simbolo play verde) cosi facendo o vado al prossimo
        // breakpoint (se presente) oppure finisco l'esecuzione del programma.
        //
        // STEP OVER:
        // clicco sul tasto "STEP OVER" salto direttamente al prossimo breakpoint (se
        // c'è) senno finisco l'esecuzione.
        //
        //

        if (parolaUno.length() > parolaDue.length()) {
            System.out.println("Parola uno più lunga");
        } else if (parolaDue.length() > parolaUno.length()) {
            System.out.println("Parola due più lunga");
        } else {
            System.out.println("Lunghe uguale");
        }
    }
}
