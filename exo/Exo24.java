package fr.afpa.exo;

import java.util.Scanner;

public class Exo24 {
	public static void main(String[] args) {
		String sex;
		int age;
		boolean c1, c2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le sexe (M/F)");
		sex = sc.next();
		System.out.println("Entrez l'age");
		age = sc.nextInt();

		//equals to test type h
		c1 = sex.equals("M")  && age >= 20;
		
		c2 = sex.equals("F") && (age > 18 && age < 35);
		
		
		if (c1 || c2 ) {
			System.out.println("imposable");
		} else {
			System.out.println("Non imposable");
		}
	}
}
