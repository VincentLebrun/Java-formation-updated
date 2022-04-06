package fr.afpa.exo;

import java.util.Scanner;

public class Exo32 {
	public static void main(String[] args) {
	    int [] tab;
		tab = new int [8];

		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < tab.length; i++) {
			System.out.println("Entrez la note numéro : " +  i );
			tab[i] = sc.nextInt();
		}

	}

}
