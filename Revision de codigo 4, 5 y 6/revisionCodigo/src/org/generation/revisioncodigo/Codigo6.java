package org.generation.revisioncodigo;

public class Codigo6 {
		  
	public static void main(String[] args) {
		
		int[] n = new int[20]; //A�adimos new

	    for (int i = 0; i < 20; i++) { //A�adimos ++
	      n[i] = (int) ((Math.random() * 381) + 20);
	      System.out.print(n[i] + " ");
	    }
	    
	    System.out.println("\n�Qu� n�meros quiere resaltar? ");//A�adimos ln
	    System.out.print("(1 � los m�ltiplos de 5, 2 � los m�ltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine());//A�adimos ) al final

	    int multiplo = (opcion == 1) ? 5 : 7; //Cambiamos de lugar ? y :

	    for (int e : n) { //Cambiamos forEach a for //Cambiamos a char a int
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	     
	    }
	      else { //Saacamos else del if
		        System.out.print(e + " ");//Cambiamos in por Out
		      }
		    
	}
	   
	}
	    
}
