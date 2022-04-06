package fr.afpa.exo;

import java.util.Scanner;

public class Exo21 {
	public static void main(String[] args) {
		int nb, i, f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre");
		nb = sc.nextInt();
		f = 1;
		for (i = 2; i < nb; i++) {
        f=f*i;
		}
		System.out.println("La factorielle est : " +f);
	}
}
