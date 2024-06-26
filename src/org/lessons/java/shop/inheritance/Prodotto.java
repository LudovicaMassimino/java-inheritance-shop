/* Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, 
i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in 
modo che:
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart 
oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura 
delle classi che gestiscono i vari sotto tipi di prodotto. */


package org.lessons.java.shop.inheritance;

import java.util.Random;

public class Prodotto {
	protected int codice;
	protected String modello;
	protected String marca;
	protected double prezzo;
	protected static final int IVA = 22;
	
	public String getModello() {
		return modello;
	}
	public void setModello(String Modello) {
		this.modello = modello;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getCodice() {
		return codice;
	}
	public static int getIva() {
		return IVA;
	}
	
	// costruttore vuoto
	public Prodotto(){
	}
	
	// costruttore
	public Prodotto(String modello, String marca, double prezzo) {
		this.modello = modello;
		this.marca = marca;
		this.prezzo = prezzo;
		this.codice = codiceRandom();
	}
	// generaro il codice con numero random
	public int codiceRandom() {
		Random random = new Random();
		return random.nextInt(100);
		}
		
		public String codiceEsteso() {
			String codiceEsteso = String.format("%08d", codice);
			return codiceEsteso;
		}
		
	// metodo per calcolare il prezzo base
	public double prezzoBase() {
		return prezzo;
	}
	
	// metodo per calcolare il prezzo con l'iva
	public double prezzoIvato() {
		return this.prezzo + (this.prezzo * IVA / 100);
	}
	
	// metodo per avere il nome esteso, ottenuto concatenando codice e nome
	public String nomeEsteso() {
		return String.format("%08d", this.codice) + "-" + this.modello;
	}
	
	@Override
	public String toString() {
		return "\n" + "Codice: " + codiceEsteso () + "\n" +
				"Modello: " + modello + "\n" +
				"Marca: " + marca + "\n" +
				"Prezzo base: € " + String.format("%.2f", prezzoBase()) + "\n" +
				"Prezzo con IVA: € " + String.format("%.2f", prezzoIvato());
				
	}
}







