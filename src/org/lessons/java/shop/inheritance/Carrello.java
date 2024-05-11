package org.lessons.java.shop.inheritance;
import java.util.Scanner;

public class Carrello {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// chiedo all'utente di inserire i dati del prodotto
		System.out.println ("Inserisci il tipo di prodotto (Smartphone, Televisori, Cuffie) :");
		String tipoProdotto = input.nextLine();
		
		System.out.println("Inserisci il modello:");
		String modello = input.nextLine();
		
		System.out.println("Inserisci la marca:");
		String marca = input.nextLine();
		
		System.out.println("Inserisci il prezzo:");
		double prezzo = input.nextDouble();
		
		Prodotto myProdotto;
		
		switch (tipoProdotto.toLowerCase()) {
		// condizione in cui l'utente scelga smartphone:
		case "smartphone":
			System.out.println("Inserisci l'IMEI:");
			String imei = input.nextLine();
			System.out.println("Inserisci la memoria:");
			long memoria = input.nextLong();
			myProdotto = new Smartphone(modello, marca, prezzo, imei, memoria);
			break;
			
		// condizione in l'utente scelga televisori:
		case "televisori":
			System.out.println("Inserisci la dimensione:");
			int pollici = input.nextInt();
			System.out.println("Il televisore è smart?");
			boolean smart = input.nextBoolean();
			myProdotto = new Televisori(modello, marca, prezzo, pollici, smart);
			break;
			
		// condizione in cui l'utente scelga cuffie:
		case "cuffie":
			System.out.println("Inserisci il colore:");
			String colore = input.nextLine();
			System.out.println("Wireless o cablate?");
			String tipo = input.nextLine();
			myProdotto = new Cuffie(modello, marca, prezzo, colore, tipo);
			break;
		// condizione in cui l'utente inserisca un prodotto non valido:	
		default:
			System.out.println("Il prodotto selezionato non è tra quelli proposti");
			return;
		}
		// adesso stampo il prodotto inserito nel carrello:
		System.out.println("Prodotto inserito nel carrello:");
		System.out.println(myProdotto);
		
		input.close();
	}
}
