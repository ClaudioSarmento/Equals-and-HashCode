package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		
		Integer c = 10;
		Integer d = 10;
		
		// Equals
		System.out.println("Comparando se ("  + a + ") é igual (" + b + ") resultado = (" + a.equals(b) +")"); //false
		System.out.println("Comparando se ("  + c + ") é igual (" + d + ") resultado = (" + c.equals(d) +")"); //true
		
		// HashCode
		System.out.println();
		System.out.println("hashCode de (" + a + ") = " + a.hashCode());
		System.out.println("hashCode de (" + b + ") = " + b.hashCode());
		
		System.out.println();
		System.out.println("hashCode de (" + c + ") = " + c.hashCode());
		System.out.println("hashCode de (" + d + ") = " + d.hashCode());
		
		// Testando Equals e HasCode da Classe Client
		
		Client c1 = new Client("Claudio", "cladio_email@mail.com");
		Client c2 = new Client("Claudio", "cladio_email@mail.com");
		Client c3 = new Client("Aline", "aline_@mail.com");

		
		// Equals
		System.out.println();
		System.out.println("Comparando se ("  + c1.getName() + ") e-mail: (" + c1.getEmail() + ") é igual (" 
		+ c2.getName()  + ") e-mail: (" + c2.getEmail() + ") resultado = (" + c1.equals(c2)+")"); //true
		
		System.out.println("Comparando se ("  + c1.getName() + ") e-mail: (" + c1.getEmail() + ") é igual (" 
				+ c3.getName()  + ") e-mail: (" + c3.getEmail() + ") resultado = (" + c1.equals(c3)+")"); //false
		
		// HashCode
		System.out.println();
		System.out.println("hashCode de (" + c1.getName() + ") e-mail: " + c1.getEmail() + " = " + c1.hashCode());
		System.out.println("hashCode de (" + c2.getName() + ") e-mail: " + c2.getEmail() + " = " + c2.hashCode());
		System.out.println("hashCode de (" + c3.getName() + ") e-mail: " + c3.getEmail() + " = " + c3.hashCode());
	}

}
