package com.esame;

import java.time.LocalDate;

public class Alimentare extends Prodotto {
    
    private LocalDate scadenza;

    // Costruttore scadenza
    public Alimentare(String n, double p, int q, LocalDate scadenza) {
        super(n, p, q);
        this.scadenza = scadenza;
    }

    // Setter scadenza
    public void setScadenza(LocalDate scadenza) {
        this.scadenza = scadenza;
    }

    public void Scaduto() {
        if (scadenza.isBefore(LocalDate.now())) {
            System.out.println(" Il prodotto è scaduto");
        } else {
            System.out.println(" Il prodotto è ancora buono fino al: " + scadenza);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                " Scadenza: " + scadenza;
    }
}
