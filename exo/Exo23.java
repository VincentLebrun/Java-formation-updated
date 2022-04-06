package fr.afpa.exo;

import java.util.Scanner;

public class Exo23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, pg, ipg;
		pg = 0;
		n = 1;
		i = 0;
		pg = 0;
		while (n != 0) {
			System.out.println("Entrez un nombre");
			n = sc.nextInt();
			i = i + 1;
			if (i == 1 || n > pg) {
				pg = n;
				ipg = i;
			}
		}
	}

}
