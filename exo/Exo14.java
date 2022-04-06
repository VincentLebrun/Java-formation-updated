package fr.afpa.exo;

import java.util.Scanner;

public class Exo14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez 2 nombres : ");

		int a = sc.nextInt();
		int b = sc.nextInt();

		if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
			System.out.println("Leur produit est positif");
		} else {

			System.out.println("Leur produit est négatif");
		}
	}
}
