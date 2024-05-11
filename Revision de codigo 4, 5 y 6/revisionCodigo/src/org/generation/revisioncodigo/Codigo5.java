package org.generation.revisioncodigo;

import java.util.Scanner; //Se import� la clase Scanner

public class Codigo5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);// Se agreg� el System.in
		System.out.println("Introduzca un n�mero: "); // Se agreg� comilla doble
		int ni = s.nextInt(); // Se cambi� String a Int
		int c = ni;

		int afo = 0;
		int noAfo = 0;

		while (ni > 0) {
			int digito = ni % 10;
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
				
			} else {
				noAfo++;
			
				ni /= 10;
			}
			if (afo > noAfo) {
				System.out.println("El " + c + " es un n�mero afortunado."); // Se cambio de prinln a println
				break;//A�adimos break
			} else {
				System.out.println("El " + c + " no es un n�mero afortunado.");
				break;//A�adimos break
			}

		}
		s.close();
	}

}