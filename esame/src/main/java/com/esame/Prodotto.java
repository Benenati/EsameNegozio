package com.esame;

public class Prodotto {
    
    // Attributi
    private String nome;
    private double prezzo;
    private int quantita;

    public Prodotto(String n, double p, int q) {
        nome = n;
        prezzo = p;
        quantita = q;
    }

    // Setter Nome
    public void setNome(String n) {
        if (n != null && n.length() > 0) 
            nome = n;
        else
            System.out.println("Il nome non puo' essere vuoto");
        
    }

    // Setter Prezzo
    public void setPrezzo(double p) {
        if (p > 0) 
            prezzo = p;
        else
            System.out.println("Il prezzo non puo' essere negativo o zero");
        
    }

    // Setter Quantita
    public void setQuantita(int q) {
        if (q >= 0) 
            quantita = q;
        else
            System.out.println("La quantita' non puo' essere negativa");
        
    }

    // Getter Nome
    public String getNome() {
        return nome;
    }

    // Getter Prezzo
    public double getPrezzo() {
        return prezzo;
    }

    // Getter Quantita
    public int getQuantita() {
        return quantita;
    }

    // Valore Totale
    public double calcolaValoreTotale() {
        return prezzo * quantita;
    }

    // Override
    @Override
    public String toString() {
        return "nome: " + nome + "\n " +
               "Prezzo: " + prezzo + "\n " +
               "Quantità: " + quantita;
    }
}
