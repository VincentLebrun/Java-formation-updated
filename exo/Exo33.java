package fr.afpa.exo;

import java.util.Scanner;

public class Exo33 {
	public static void main(String[] args) {
		int nb, nbNeg, nbPos;
		int[] arr;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le nombre de valeurs : ");
		nb = sc.nextInt();
		arr = new int[nb];
		nbPos = 0;
		nbNeg = 0;
		for (int i = 0; i < nb; i++) {
			System.out.printf("Entrez le nombre  n° ", arr.length);
			arr[i] = sc.nextInt();
			if (arr[i] > 0) {
				nbPos = nbPos + 1;
			} else {
				nbNeg = nbNeg + 1;
			}

		}
		System.out.println("Nombre de valeurs positives " + nbPos);
		System.out.println("Nombre de valeurs positives " + nbNeg);
	}
}
