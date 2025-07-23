package org.lessons.java.oop.test.generali;

import java.util.Scanner;

public class OldestPerson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Età Uno: ");
        int etaUno = scan.nextInt();

        System.out.println("Età Due: ");
        int etaDue = scan.nextInt();

        if (etaUno > etaDue) {
            System.out.println("Uno più anziano");
        } else if (etaDue > etaUno) {
            System.out.println("Due più anziano");
        } else {
            System.out.println("Coetanei");
        }

        scan.close();
    }
}
