package fr.afpa.exo;

import java.util.Scanner;

public class Exo22 {
	
 public static void main (String[] args) {
	 int nb, i , pg;
		Scanner sc = new Scanner(System.in);
		pg= 0;
		
		for(i= 1 ; i <= 20; i++) {
			System.out.println("Entrez un nombre");
			nb = sc.nextInt();
			if( i == 1 || nb > pg) {
				pg = nb;
			}
			
		}
		System.out.println("Le plus grand nombre était" + pg);
 }
}
