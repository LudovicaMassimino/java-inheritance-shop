package org.lessons.java.shop.inheritance;

public class Televisori extends Prodotto {
	protected int pollici;
	protected boolean smart;
	
	// costruttore
	public Televisori(String modello, String marca, double prezzo, int pollici, boolean smart) {
		super(modello, marca, prezzo);
		this.pollici = pollici;
		this.smart = smart;
		this.codice = super.codice;
		}
	// toString
	/*public String toString() {
		return "modello: " + this.modello + "\n" + this.marca + "\n" + this.codice + "\n" + this.prezzoConIva() + "\n" + this.pollici + "\n" + this.smart + "\n";
	}*/
	
	@Override
	public String toString() {
		return "Televisori: " + super.toString() +
				", dimensione: " + pollici + 
				", smart: " + smart;
	}
}