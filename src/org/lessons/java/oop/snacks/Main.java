package org.lessons.java.oop.snacks;

public class Main {
    public static void main(String[] args) {

        // SNACK 1
        //
        Studente Aldo = new Studente("Aldo", "Baglio", 66);
        Studente Giovanni = new Studente("Giovanni", "Storti", 68);
        Studente Giacomo = new Studente("Giacomino", "Poretti", 69);
        System.out.println(Aldo.NomeCognomeEta());
        System.out.println(Giovanni.NomeCognomeEta());
        System.out.println(Giacomo.NomeCognomeEta());
        System.out.println(Aldo.toString());
        //
        //
        //
        // SNACK2
        //
        // ContoBancario contoUno = new ContoBancario(12345);
        // System.out.println(contoUno.getNumeroConto());
        // System.out.println(contoUno.getSaldo());
        // System.out.println(contoUno.getSaldo());
        // contoUno.preleva(40);
        // contoUno.deposita(23);
        // contoUno.preleva(110);
        // contoUno.getSaldo();
        // contoUno.deposita(10000);
        // System.out.println("Saldo finale: " + contoUno.getSaldo());
        //
        //
        //
        // SNACK 3
        //
        // RegistroStudenti registro = new RegistroStudenti();
        // registro.AggiungiStudente(Aldo);
        // registro.AggiungiStudente(Giovanni);
        // registro.AggiungiStudente(Giacomo);
        // registro.StampaRegistro();

    }
}
