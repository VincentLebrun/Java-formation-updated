package fr.afpa.exo;

import java.util.Scanner;

public class Exo29 {
	public static void main(String[] args) {
		int  n , som;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez n");
		n = sc.nextInt(); 
		som = 0;
		for(int i = 1; i < n; i++ ) {
			som = som+ i*i*i;
		
		}
		System.out.println("La somme cubiques des n entiers est " + som);
	}
}
