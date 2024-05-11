package org.generation.revisioncodigo;

import java.util.Scanner; //Se importó la clase Scanner

public class Codigo5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);// Se agregó el System.in
		System.out.println("Introduzca un número: "); // Se agregó comilla doble
		int ni = s.nextInt(); // Se cambió String a Int
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
				System.out.println("El " + c + " es un número afortunado."); // Se cambio de prinln a println
				break;//Añadimos break
			} else {
				System.out.println("El " + c + " no es un número afortunado.");
				break;//Añadimos break
			}

		}
		s.close();
	}

}