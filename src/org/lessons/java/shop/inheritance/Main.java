package org.lessons.java.shop.inheritance;

public class Main {
	public static void main(String[] args) {
		//Smartphone mySmartphone = new Smartphone("Iphone", "Apple", 900.00, "123456789012345", 32);
//		System.out.println("Nome del prodotto: " + mySmartphone.getNome());
//        System.out.println("Marca del prodotto: " + mySmartphone.getMarca());
//        System.out.println("Prezzo base: " + "€ " + mySmartphone.getPrezzo());
//        System.out.println("Prezzo compreso di IVA al 22%: " + "€ " + mySmartphone.prezzoConIva());
//        System.out.println("codice: " + mySmartphone.codice);
		
		//System.out.println(mySmartphone.toString());
		
		/*Televisori myTelevisori = new Televisori("UE40", "Samsung", 400.00 ,30, true);
		System.out.println(myTelevisori.toString());
		
		Cuffie myCuffie = new Cuffie("tuneBM","JBL", 150.00, "blu", "wireless");
		System.out.println(myCuffie.toString());*/
		
		Prodotto myProdotto = new Prodotto("Prodotto1", "Marca1", 100);
		System.out.println(myProdotto);
	}
}