package fr.afpa.exo;

import java.util.Scanner;

public class Exo17 {
  
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		int m , n;
		System.out.println("Saisissez 2 nombres ");
		m = sc.nextInt(); 
		n = sc.nextInt(); 		
		if(m == 0 || n == 0 ) {
			System.out.println("Le produit est nul");
		
		}else if ((m < 0 && n < 0) || (m>0 && n > 0) ) {
			System.out.println("Le produit est positif");
		}else {
			System.out.println("Le produit est négatif");
		}
	}
}
