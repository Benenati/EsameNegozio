package com.esame;

import java.time.LocalDate;
import java.util.Scanner;

public class esame {

    public static void main(String[] args){
       Negozio negozio = new Negozio();

	   int scelta;
	    do {
	       System.out.println("1. Aggiungi prodotto");
	       System.out.println("2. Mostra scaffale");
	       System.out.println("3. Calcola valore totale");
	       System.out.println("4. Esci");
	       System.out.print("Scegli un'opzione: ");
	       scelta = Integer.parseInt(System.console().readLine());
	       System.out.print(" ");

		   switch (scelta)
		   {
		       case 1:
		           // Aggiungi prodotto manualmente
				   aggiungiProdottoManualmente(negozio);
		           break;

		       case 2:
		           // Mostra scaffale
		           negozio.mostraScaffale();
		           break;

		       case 3:
		           // Calcola valore totale
		           double valoreTotale = negozio.calcolaValoreTotale();
		           System.out.println("Valore totale dello scaffale: " + valoreTotale);
		           break;

		       case 4:
		           System.out.println("Uscita dal programma...");
		           break;

		        default:
		           System.out.println("Opzione non valida. Riprova.");
		           break;
		    }
	    } while (scelta != 4);
    }

	// Aggiungi un prodotto manualmente
	private static void aggiungiProdottoManualmente(Negozio negozio) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Inserisci il nome del prodotto: ");
		String nome = scanner.nextLine();
		System.out.print(" Inserisci il prezzo del prodotto: ");
		double prezzo = scanner.nextDouble();
		System.out.print(" Inserisci la quantità del prodotto: ");
		int quantita = scanner.nextInt();

		System.out.print(" Il prodotto è alimentare? (y/n): ");
		char scelta = scanner.next().charAt(0);
		if (scelta == 'y' || scelta == 'Y') {
			System.out.print(" Inserisci la data di scadenza (YYYY-MM-DD): ");
			String dataScadenza = scanner.next();
			LocalDate scadenza = LocalDate.parse(dataScadenza);
			Alimentare alimentare = new Alimentare(nome, prezzo, quantita, scadenza);
			negozio.aggiungiProdotto(alimentare);
		} else {
			Prodotto prodotto = new Prodotto(nome, prezzo, quantita);
			negozio.aggiungiProdotto(prodotto);
		}
	}
}