package org.lessons.java.oop.test.generali;

public class Auto {

    // caratteristiche tipiche ==> ATTRIBUTI - fields - campi - "quello che sà"
    private String brand;
    private String model;
    private String color;
    private int hp;
    private int numberOfDoors;
    private boolean hasStarted;
    private boolean inWorkshop;

    // La classe private nelle variabili di istanza le rende inaccessibili
    // direttamente
    // affidando il compito di recuperare e modificare ai SETTER E GETTER
    // vediamola come una misura di sicurezza per evitare che venga modificato
    // direttamente il costruttore (ad esempio in setHp c'è la condizione che sia
    // "> 0". se modificassi direttamente con cinquecento.hp potrei dare valori
    // negativi)
    //
    //
    // Modificatori di accesso:
    // PRIVATE - PROTECTED - DEFAULT (puoi lasciare vuoto) - PUBLIC
    // Ambito di visibilità:
    // PRIVATE --> Classe;
    // PROTECTED --> Classe , Package;
    // DEFAULT --> Classe, Package, Sottoclasse;
    // PUBLIC --> Classe, Package, Sottoclasse, Mondo esterno;
    //
    //
    // ATTRIBUTI STATICI (indipendenti dall'oggetto/istanza) ad esempio qua
    // definiamo
    // che tutte le auto hanno 4 ruote, questo attributo sarà static e verrà
    // condiviso con tutte le Auto create, in più, se modificassimo il suo valore,
    // questo, essendo
    // condiviso tra tutte le auto create, verrà automaticamente aggiornato per
    // tutte, il suo ambito di visibilità non può essere "private" poichè è un
    // attributo che esiste fuori dal costruttore, perciò deve poter
    // essere
    // visto al di fuori della sua classe, in questo caso deve essere visbile in
    // tutto il
    // package perciò il suo modficatore d'accesso dovrà essere "protected"
    protected static int numberOfWheels = 4;
    // per modificare questo valore devo creare un metodo, detto METODO STATICO (da
    // riga 168)

    //
    //
    // COSTRUTTORE con parametri
    public Auto(String brand, String model, String color, int hp, int numberOfDoors) {
        // tutte le info necessarie ad inizializzare la nostra istanza (il nostro
        // oggetto)
        this.brand = brand; // ATTENZIONE IMPORTANTISSIMO
        this.model = model; // "this.model" è quello a riga 7. "model" invece è quello a riga 16
        this.color = color; // cosi per tutti i valori ("this" si riferisce agli attributi e l'altro
        this.hp = hp; // all'argomento del costruttore)
        this.numberOfDoors = numberOfDoors;
        this.hasStarted = false; // mentre "hasStarted" e "inWorkshop" (che non sono presenti come parametri
        this.inWorkshop = false; // nel costruttore) le inizializzo direttamente qua dentro

    }

    // METHOD OVERLOADING (OVERLOAD) sul COSTRUTTORE (Vedi OVERLOAD riga 69):
    // COSTRUTTORE senza parametri
    public Auto() {
        this.brand = "Senza marca";
        this.model = "Modello senza nome";
        this.color = "Modello senza colore";
        this.hp = 0;
        this.numberOfDoors = 0;
        this.hasStarted = false;
        this.inWorkshop = false;
    }

    // GETTER SETTER
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand.toLowerCase();
        }
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (model != null) {
            this.model = model.toLowerCase();
        }
    }

    // SIGNATURE:
    // l'insieme del nome e dei parametri di un metodo si chiama signature ("firma")
    //
    // OVERLOAD:
    ///qui prendiamo ad esempio setModel, fare un overload
    // significa creare un metodo che abbia lo stesso nome ma un
    // numro diverso di parametri

    public void setModel() {
        this.model = "Modello senza nome";
    }

    // Quando nel mio Main richiamo setModel e gli passo qualcosa avro il primo:
    // --> [setModel(String model)]
    // se invece chiamo setModel e non gli do parametri uso il secondo:
    // --> [setModel()]

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color.toLowerCase();
        }
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp > 0) {
            this.hp = hp;
        }
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors >= 0) {
            this.numberOfDoors = numberOfDoors;
        }
    }

    public boolean getHasStarted() {
        return this.hasStarted;
    }

    public void setHasStarted(boolean hasStarted) {
        this.hasStarted = hasStarted;
    }

    public boolean getInWorkshop() {
        return this.inWorkshop;
    }

    public void setInWorkshop(boolean inWorkshop) {
        this.inWorkshop = inWorkshop;
    }

    // capacità tipiche ==> METODI AGGIUNTIVI- quello che può fare
    public void startUp() {
        this.hasStarted = true;
    }

    public void turnOff() {
        hasStarted = false;
    }

    // METODI STATICI
    public static void updateNumberOfWheels(int numberOfWheels) {
        // qua sarebbe "this.qualcosa = qualcos'altro".. ma il "this" non si può usare
        // in un contesto statico, perchè non c'è un'istanza(oggetto), e il this si
        // riferisce sempre agli attributi di un'istanza(oggetto), la questione si
        // risolve
        // utilizzando il nome della Classe (in tal caso "Auto")
        Auto.numberOfWheels = numberOfWheels;
    }
}
