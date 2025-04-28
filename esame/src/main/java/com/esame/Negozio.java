package com.esame;

public class Negozio {
    private Prodotto[] scaffale;
    private static int ultima = 0;

    public Negozio(){
        scaffale = new Prodotto[50];
    }

    // Aggiungere un prodotto allo scaffale
    public void aggiungiProdotto(Prodotto p){
        if (ultima < scaffale.length){
            scaffale[ultima] = p;
            ultima++;
        } else {
            System.out.println(" Scaffale pieno, non posso aggiungere altri prodotti");
        }
    }

    // Valore Totale
    public double calcolaValoreTotale(){
        double valoreTotale = 0;
        for (int i = 0; i < ultima; i++){
            Prodotto prodotto = scaffale[i];
            valoreTotale += prodotto.calcolaValoreTotale();
        }
        return valoreTotale;
    }

    // Stampa lo scaffale
    public void mostraScaffale(){
        if (ultima == 0){
            System.out.println(" Scaffale vuoto");
        } else {
            for (int i = 0; i < ultima; i++){
                Prodotto prodotto = scaffale[i];
                System.out.println(prodotto);
                if (prodotto instanceof Alimentare){
                    Alimentare alimentare = (Alimentare) prodotto;
                    alimentare.Scaduto();
                }
                System.out.println();
            }
        }
    }
}
