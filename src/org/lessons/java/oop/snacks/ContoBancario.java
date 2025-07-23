package org.lessons.java.oop.snacks;

import java.util.Random;

public class ContoBancario {
    // ATTRIBUTI
    private int numeroConto;
    //
    //
    private int saldo;

    // APPROFINDIMENTO BIGDECIMAL
    // saldo dovrebbe essere un BigDecimal, ciò comporta che
    // nei metodi non potremo usare gli operatori "<" ">" "="
    // ma dovremousare i metodi "add.", "subtract.", "compareTo." etc.etc.
    //
    //
    // COSTRUTTORI
    // 1) senza parametri, numero conto generato randomicamente
    public ContoBancario() {
        Random rand = new Random();
        this.numeroConto = rand.nextInt(999999);
        this.saldo = 0;
    }

    // 2) con parametri, numero conto da inserire a mano
    public ContoBancario(int numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    // GETTER E SETTER
    public int getNumeroConto() {
        return this.numeroConto;
    }

    public void setNumeroConto(int numeroConto) {
        this.numeroConto = numeroConto;
    }

    public int getSaldo() {
        return this.saldo;
    }

    // SetSaldo meglio renderlo privato per ovvie ragioni
    // private void setSaldo(int saldo) {
    // this.saldo = saldo;
    // }

    // METODI PUBBLICI

    public void deposita(int importo) {
        if (importo > 0) {
            this.saldo = saldo + importo;
            System.out.println("Deposito di: " + importo + " euro.\nNuovo saldo: " + this.saldo + " euro");
        }
    }

    public void preleva(int prelievo) {
        if (prelievo < 0) {
            System.out.println("Impossibile prelevare somme negative");
            return;
        }

        if (saldo >= prelievo) {
            this.saldo = saldo - prelievo;
            System.out.println("Prelievo di: " + prelievo + "euro.\nNuovo saldo:" + this.saldo + " euro");
        } else {
            System.out.println("Fondi insufficienti");
        }
    }

}
