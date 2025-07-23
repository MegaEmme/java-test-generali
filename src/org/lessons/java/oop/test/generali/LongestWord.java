package org.lessons.java.oop.test.generali;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Parola Uno: ");
        String parolaUno = scan.nextLine();

        System.out.println("Parola Due: ");
        String parolaDue = scan.nextLine();

        if (parolaUno.length() > parolaDue.length()) {
            System.out.println("Parola uno più lunga");
        } else if (parolaDue.length() > parolaUno.length()) {
            System.out.println("Parola due più lunga");
        } else {
            System.out.println("Lunghe uguale");
        }

        scan.close();
    }
}
