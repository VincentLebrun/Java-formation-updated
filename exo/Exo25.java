package fr.afpa.exo;

import java.util.Scanner;

public class Exo25 {
	public static void main(String[] args) {
		int a, b; 
		float moy;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez la 1 ère valeur");
		a = sc.nextInt(); 
		System.out.println("Donnez la 2 ème valeur");
	    b = sc.nextInt(); 
	       moy = (a+b)/2;
	       System.out.println("La moyenne est" + moy);
		
		
		
	}
}

