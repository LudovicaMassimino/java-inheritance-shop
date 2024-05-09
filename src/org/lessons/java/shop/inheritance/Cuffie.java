package org.lessons.java.shop.inheritance;

public class Cuffie extends Prodotto {
	protected String colore;
	protected String tipo;

	// costruttore
	public Cuffie(String modello, String marca, double prezzo, String colore, String tipo) {
		super(modello, marca, prezzo);
		this.colore = colore;
		this.tipo = tipo;
		this.codice = super.codice;
	}
	// toString
	public String toString() {
		return "modello: " + this.modello + "\n" + this.marca + "\n" + this.codice + "\n" + this.prezzoConIva() + "\n" + this.colore + "\n" + this.tipo + "\n";
	}
}
