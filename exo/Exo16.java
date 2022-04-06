package fr.afpa.exo;

import java.util.Scanner;

public class Exo16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Saisissez un nombre");
		int nb = sc.nextInt();
		if (nb < 0) {
			System.out.println("Ce nombre est négatif");

		} else if (nb == 0) {
			System.out.println("Ce nombre est nul");
		} else {
			System.out.println("Ce nombre est positif");
		}
		sc.close();
		System.exit(0);

	}

}
