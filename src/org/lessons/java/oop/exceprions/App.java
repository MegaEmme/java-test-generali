package org.lessons.java.oop.exceprions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    // public static void main(String[] args) {
    //
    // CHECKED Exception (Errori in tempo di compliazioni ==> vanno gestiti)
    //
    // ESEMPI:
    //
    // Creo un FileReader e gli do in pasto a FileReader una path per un file .txt
    // inesistente (FileReader serve a leggere stringhe all'interno di un file):
    //
    // FileReader reader = new FileReader("path/per/file/inesistente.txt");
    //
    // Se adesso provo a far partire il progetto, il terminale mi dirà:
    //
    // "Exception in thread "main" java.lang.Error: Unresolved compilation problem:
    // Unhandled exception type FileNotFoundException"
    //
    // Mi sta cioè dicendo che c'è un errore in fase di compilazione (VA gestito)
    // }
    //
    //
    // Possibilità 1):
    // - Informiamo chi ci sta invocando che la lanciamo
    // - Aggiungo la keyword "throw" al metodo main()
    //
    //
    // public static void main(String[] args) throws FileNotFoundException {
    // FileReader reader = new FileReader("path/per/file/inesistente.txt");
    // A questo punto non abbiamo più nessun errore, ma quando lo eseguiamo prova a
    // risalire il nostro stack delle chiamate e non riesce ad arrivare da nessuna
    // parte, quello che succede è che viene interrotto il flusso del
    // programma, qualcuno però lo deve gestire, quindi:
    // }
    //
    //
    // Possibilità 2):
    // - Lo andiamo ad inglobare in un "try-catch"
    // - Nel blocco "try" inserisco il mio FileReader
    // - Nel blocco "catch" indico qualce eccezione voglio andare a "catturare"
    //
    //
    // public static void main(String[] args) {
    // try {
    // FileReader reader = new FileReader("path/per/file/inesistente.txt");
    // } catch (FileNotFoundException exception) {
    // System.out.println(
    // "Non è possibile trovare il file, controllare se sia presente o se sia
    // sbagliato l'indirizzo inserito");
    // ...Qui magari inserisco altre istruzioni per far si che non si blocchi
    // l'esecuzione, come il far richiedere l'info finche non sia stata corretta
    // }
    // Lanciando questo il terminale mi stamperà solo il messaggio che ho inserito
    // io (ln.52)
    // }
    //
    //
    // Errore generico + "finally":
    // Se invece il mio errore non fosse stato del tipo "FileNotFoundException",
    // potrei pensare di mettere un secondo "catch", che "cattura" un errore più
    // generico (Exception) e, semppre magari, restituisce un messaggio generico
    // seguito dal dettaglio di quel messagio ottenuto tramite il metodo
    // "getMessage()":
    // public static void main(String[] args) {
    // try {
    // FileReader reader = new FileReader("path/per/file/inesistente.txt");
    // qua ho rimosso il catch con FileNotFoundException solo per poter cadere
    // nell'errore generico
    // } catch (Exception e) {
    // System.out.println("C'è stato un eccezione con messaggio: " +
    // e.getMessage());
    // }
    // Dopodiche lancio "finally", lo avremo in ogni caso, sia nel caso ci sia un
    // eccezione sia quando non c'è:
    // finally {
    // System.out.println("Esecuzione del programma terminata!");
    // }
    // }
    //
    //
    // ECCEZIONE "IllegalArgumentException":
    //
    //
    // public static void main(String[] args) {
    // qua immaginiamo che sia una condizione, tipo un if()..
    //
    //
    // throw new IllegalArgumentException("Argomento non piaciuto");
    // se ora runno il programma non ho un errore a disposizone ma viene
    // semplicemente lanciata quell'eccezione, nel terminale mi comparirà il
    // messaggio :"Argomento non piaciuto", anche se non sono obbligato a farlo (il
    // codice non da errori di fatto) lo posso gestire, quantomeno di modo tale che
    // mi faccia capire dove è l'errore
    // }
}
