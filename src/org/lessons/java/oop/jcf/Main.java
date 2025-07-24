package org.lessons.java.oop.jcf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Collection - List - ArrayList
        //
        //
        // Creo un ArrayList
        // ArrayList<String> listaDiStringhe = new ArrayList<>();
        // // tramite ".add()" aggiungo cinque frasi:
        // listaDiStringhe.add("frase Uno");
        // listaDiStringhe.add("frase Due");
        // listaDiStringhe.add("frase Tre");
        // listaDiStringhe.add("frase Quattro");
        // listaDiStringhe.add("frase Cinque");
        // // stampo a terminale l'array riempito con le cique frasi;
        // System.out.println(listaDiStringhe);
        // // Aggiungo "frase Zero" in testa (".addFirst()"):
        // listaDiStringhe.addFirst("frase Zero");
        // // stampo a terminale l'array con "frase Zero" in testa;
        // System.out.println(listaDiStringhe);
        // // Aggiungo "frase Finale" in code all'Array (".addLast()"):
        // listaDiStringhe.addLast("frase Finale");
        // // stampo a terminale l'array con "frase Finale" in coda;
        // System.out.println(listaDiStringhe);
        // // Rimuovo l'elemento con indice 3 "frase Tre" (".remove()")
        // listaDiStringhe.remove(3);
        // // stampo a terminale l'array senza per vedere che l'elemento è stato rimosso
        // System.out.println(listaDiStringhe);
        // // Se voglio ottenere un elemento in base all'indice uso il metodo ".get()",
        // // (nel nostro caso a indice 2 corrisponde "frase Due")
        // System.out.println(listaDiStringhe.get(2));
        // // per stampare tutti i valori dell'array uso un ciclo for classico, con la
        // // differenza che in ArrayList devo usare i metodi "size()" e "get()"
        // for (int i = 0; i < listaDiStringhe.size(); i++) {
        // System.out.println(listaDiStringhe.get(i));
        // }
        // // o il forEach, scritto però in questo modo:
        // for (String elem : listaDiStringhe) {
        // System.out.println(elem);
        // }
        // // per ogni elemento (elem) dentro (:) listaDiStringhe, stampa a terminale
        // // (System.out.println()) l'elemento (elem)
        //
        //
        //
        //
        // Collection - Set - HashSet (no duplicati, ordinamento numerico)
        //
        //
        // AUTOBOXING: trasformazione di un elemento primitivo in un oggetto, è
        // una trasformazione necassaria per passare il tipo (<...>) al Set, in
        // questo caso devo traformare un int in un integer
        // Creo un HashSet
        // Set<Integer> insiemeDiNumeri = new HashSet<>();
        // // Aggiungo dei valori
        // insiemeDiNumeri.add(55);
        // // vedrò che 55 compare una volta sola anche se lo aggiungo piu volte
        // insiemeDiNumeri.add(55);
        // insiemeDiNumeri.add(-155);
        // insiemeDiNumeri.add(4);
        // insiemeDiNumeri.add(-1);
        // insiemeDiNumeri.add(2);
        // insiemeDiNumeri.add(3);
        // // quando stampo i valori mi accorgo che sono ordinati in maniera crescente
        // System.out.println(insiemeDiNumeri);
        // // ciclo forEach
        // for (Integer integer : insiemeDiNumeri) {
        // System.out.println(integer);
        // }
        // // metodo ".clear()" ripulisce
        // // insiemeDiNumeri.clear();
        // // System.out.println(insiemeDiNumeri);
        // // e tanti altri metodi...
        //
        //
        //
        //
        // Map - HashMap (sistema di chiavi-valori , chiavi uniche , valori duplicabili)
        // Map<String, Integer> nomiNumeri = new HashMap<>();
        // // per aggiungere valori uso il metodo (".put(key,index)")
        // nomiNumeri.put("Gina", 11);
        // nomiNumeri.put("Ginetto", 145);
        // nomiNumeri.put("Ginettina", 11);
        // nomiNumeri.put("Ginettino", 11);
        // nomiNumeri.put("Ada", 15);
        // nomiNumeri.put("Francesco", 35);
        // // stampo
        // System.out.println(nomiNumeri);
        // // e per fare un ciclo forEach? nomiNumeri non mi da la possibilità
        // // di iterare essendo costruito da elementi a due parametri (chiave, valore),
        // // quello che posso fare è iterare sulle une (chiavi) o su gli altri (valori)
        // //
        // // --> iterazione sulle chiavi (".keySet()"):
        // for (String chiave : nomiNumeri.keySet()) {
        // System.out.println(chiave);
        // }
        // //
        // // --> iterazione sui valori (".values()"):
        // for (Integer valore : nomiNumeri.values()) {
        // System.out.println(valore);
        // }
        // // tuttavia Map ci mette a disposizione il metodo .get() grazie al
        // // quale possiamo ottenere sia chiave che valore iterando un solo ciclo:
        // for (String chiave : nomiNumeri.keySet()) {
        // System.out.println(chiave);
        // System.out.println(nomiNumeri.get(chiave));
        // }
    }
}
