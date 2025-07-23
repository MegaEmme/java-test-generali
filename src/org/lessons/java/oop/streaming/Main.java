package org.lessons.java.oop.streaming;

public class Main {
    public static void main(String[] args) {
        // 1) primo esempio con superclasse Contenuto
        Contenuto contenuto = new Contenuto("Documentario su Van Gogh");
        // dopo aver effettuato @Override del metodo toString(), mi compare il nuovo
        // messaggio: "Contenuto con titolo: 'titolo del Contenuto'", prima di
        // effettuare l'Override avrebbe restituito l'inidirizzo di un luogo in memoria
        // (poco utile per noi), essendo dunque Film, Serie e Documentario, classi
        // figlie di Contenuto, ereditano il metodo toString() con l'Override;
        System.out.println(contenuto);
        System.out.println(contenuto.getTitolo());
        System.out.println(contenuto.riproduci());

        String[] cast = { "Jude Law", "Meryl Streep", "Robert De Niro", "Leonardo Di Caprio" };
        String[] episodi = { "1 - uno", "2 - due", "3 - tre ", "4 - quattro" };
        // 2) secondo esempio con sottoclasse Film
        Film ilSignoreDegliAnelli = new Film("Il Signore Degli Anelli: Le Due Torri",
                cast, 181);
        System.out.println(ilSignoreDegliAnelli);
        System.out.println(ilSignoreDegliAnelli.riproduci());

        // 3) terzo esempio con sottoclasse Serie
        Serie beautiful = new Serie("Beautiful", cast, episodi);
        System.out.println(beautiful);
        System.out.println(beautiful.riproduci());
        System.out.println("Cast completo:");
        for (int i = 0; i < cast.length; i++) {
            System.out.println(beautiful.getCast()[i]);
        }
        System.out.println("Lista episodi:");
        for (int i = 0; i < episodi.length; i++) {
            System.out.println(beautiful.getEpisodi()[i]);
        }

        // 4) quarto esempio con sottoclasse Documentario
        Documentario vanGoghDocu = new Documentario("Vincent", 100);
        System.out.println(vanGoghDocu);
        System.out.println(vanGoghDocu.riproduci());
    }
}
