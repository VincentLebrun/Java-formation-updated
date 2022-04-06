package fr.afpa.exo;

import java.util.Scanner;

public class Exo37 {
	public static void main(String[] args) {
		int i, n ;
		int [] tab ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le nombres de valeurs : ");
		n= sc.nextInt();
		tab = new int[n];
		for (i= 1 ; i< n ; i++ ) {
			System.out.println("entrez le nombre numéro " + i );
			tab[i]= sc.nextInt();
			
		}
		System.out.println("Nouveau tableau ");
		for(i= 0 ; i< n ; i++) {
			tab[i] = tab[i] + 1;
			System.out.println(tab[i]);
		}
	}
}
