package fr.afpa.exo;


import java.util.Scanner;

public class Exo35 {
	public static void main(String[] args) {
		// initialisation des tableaux vides
		int n;
		// int [][] t = new int[3][1] ;
		int[] t1 = new int[] { 4, 8, 7, 9, 1, 5, 4, 6 };
		int[] t2 = new int[] { 7, 6, 5, 2, 1, 3, 7, 4 };
		int[] t3 ;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le nombre de valeurs :  ");
		n = sc.nextInt();
		
		t3 = new int[n];
		for (int i = 0; i < t1.length; i++) {
			t3[i] = t1[i] + t2[i];
			System.out.print(t1[i]);
		}
		System.out.println();
		for (int i = 0; i < t2.length ; i++) {
			
			System.out.print(t2[i]);
		}
		System.out.println();
		for (int i = 0; i < t3.length ; i++) {
			
			System.out.print(t3[i]);
		}
		
	}
}
