package fr.afpa.exo;

import java.util.Scanner;

public class Exo19 {

	public static void main(String[] args) {
		int nb;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre");
		nb = sc.nextInt();
		System.out.println("Les 10 nombres suivant sont : ");
		for (int i = nb + 1; i <= nb + 10; i++) {
			System.out.println(i);
		}
	}
}
