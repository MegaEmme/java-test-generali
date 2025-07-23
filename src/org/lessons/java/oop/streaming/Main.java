package org.lessons.java.oop.streaming;

public class Main {
    public static void main(String[] args) {
        // 1) primo esempio con superclasse Contenuto
        // Contenuto contenuto = new Contenuto("Documentario su Van Gogh");
        // System.out.println(contenuto.getTitolo());
        // System.out.println(contenuto.riproduci());
        //
        String[] cast = { "Jude Law", "Meryl Streep", "Robert De Niro", "Leonardo Di Caprio" };
        String[] episodi = { "1 - uno", "2 - due", "3 - tre ", "4 - quattro" };
        // 2) secondo esempio con sottoclasse Film
        // Film ilSignoreDegliAnelli = new Film("Il Signore Degli Anelli: Le Due Torri",
        // cast, 181);
        // System.out.println(ilSignoreDegliAnelli.riproduci());
        //
        // 3) terzo esempio con sottoclasse Serie
        Serie beautiful = new Serie("Beautiful", cast, episodi);
        System.out.println(beautiful.riproduci());
        System.out.println("Cast completo:");
        for (int i = 0; i < cast.length; i++) {
            System.out.println(beautiful.getCast()[i]);
        }
        System.out.println("Lista episodi:");
        for (int i = 0; i < episodi.length; i++) {
            System.out.println(beautiful.getEpisodi()[i]);
        }

    }
}
