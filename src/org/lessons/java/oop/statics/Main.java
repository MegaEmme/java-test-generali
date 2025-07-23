package org.lessons.java.oop.statics;

public class Main {
    public static void main(String[] args) {
        // "Calcolatrice.somma" si definisce come INVOCAZIONE STATICA
        // solitamente a causa del modifcatore di accesso "private" non possiamo mai
        // accedere agli attributi tramite dotNotation, per questo infatti
        // usiamo SETTER E GETTER
        System.out.println(Calcolatrice.somma(3, 4));
        System.out.println(Calcolatrice.moltiplica(-3, -3));
    }
}
