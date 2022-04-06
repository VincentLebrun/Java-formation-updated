package fr.afpa.exo;

import java.util.Scanner;

public class Exo34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nb, i, som;
		int[] tab;

		System.out.println("Entrez le nombre de valeurs :  ");
		nb = sc.nextInt();
		tab = new int[nb];
		som = 0;
		for (i = 0; i < nb - 1; i++) {
			som = som + tab[i];
		}
		System.out.println("Somme des éléments du tableau " + som);
	}

}
