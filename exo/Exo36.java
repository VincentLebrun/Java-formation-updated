package fr.afpa.exo;

import java.util.Scanner;

public class Exo36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, n1, n2, s;
		int[] t1 ;
		int[] t2 ;

		System.out.println("Entrez la tzaille de t1 et de t2 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		t1 = new int[n1];
		t2 = new int[n2];
		s = 0;
		for (i = 0; i < n1; i++) {
			for (j = 0; j < n2; j++) {
				s = s + t1[i] * t2[j];
				
			}
		}
		System.out.println("La somme est : ");
	}
}
