package org.lessons.java.shop.inheritance;
import java.util.Random;

public class Smartphone extends Prodotto  {
	protected String imei;
	protected long memoria;
	
	// costruttore
	public Smartphone(String modello, String marca, double prezzo, String imei, long memoria) {
		super(modello, marca,prezzo);
		this.imei = imei;
		this.memoria = memoria;
		this.codice = super.codice;
	}
	
	// toString
	public String toString() {
		return "modello: " + this.modello + "\n" + this.marca + "\n" + this.codice + "\n" + this.prezzoConIva() + "\n" + this.imei + "\n" + this.memoria + "\n";
	}
}
